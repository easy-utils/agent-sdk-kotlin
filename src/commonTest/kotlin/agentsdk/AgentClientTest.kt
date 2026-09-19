package agentsdk

import agent.v1.Preset
import easyrpc.Transport
import easyrpc.Request
import easyrpc.Response
import easyrpc.Stream
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import pbandk.encodeToByteArray

/** A stub transport that echoes a canned encoded message, so the SDK surface
 *  can be exercised without a network (all targets). */
private class StubTransport(private val body: ByteArray) : Transport {
    var lastUrl: String? = null
    override suspend fun send(req: Request): Response {
        lastUrl = req.url
        return Response(status = 200, body = body)
    }
    override suspend fun openStream(req: Request): Stream = throw UnsupportedOperationException()
}

class AgentClientTest {
    @Test
    fun listPresetsDecodesResponse() = runTest {
        val resp = agent.v1.ListPresetsResponse(presets = listOf(Preset(id = "p1"), Preset(id = "p2")))
        val stub = StubTransport(resp.encodeToByteArray())
        val c = AgentClient("http://unused", transport = stub)
        val presets = c.listPresets("zh")
        assertEquals(listOf("p1", "p2"), presets.map { it.id })
        assertEquals("/agent.v1.AgentService/ListPresets", stub.lastUrl)
    }
}
