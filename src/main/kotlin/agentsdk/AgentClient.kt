// Agent typed client SDK for Kotlin/JVM over easy-rpc (agent.v1.AgentService).
// AgentServiceClient (generated) wraps an easy_rpc Transport; this adds Bearer
// auth on top of the default OkHttpTransport.
package agentsdk

import easyrpc.*
import agent.v1.*
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class AgentClient(
    baseUrl: String,
    token: String = "",
    transport: Transport? = null,
) {
    private val _rpc: AgentServiceClient

    init {
        val t = transport ?: OkHttpTransport(
            client = OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(0, TimeUnit.SECONDS)
                .build(),
            base = baseUrl,
        )
        _rpc = if (token.isEmpty()) {
            AgentServiceClient(t)
        } else {
            AgentServiceClient(AuthTransport(t, "Bearer $token"))
        }
    }

    fun client(): AgentServiceClient = _rpc

    fun listPresets(locale: String): List<agent.v1.Preset> =
        kotlinx.coroutines.runBlocking {
            _rpc.listPresets(agent.v1.ListPresetsRequest.newBuilder().setLocale(locale).build()).presetsList
        }
}

/** Adds an Authorization header to every request. */
class AuthTransport(
    private val inner: Transport,
    private val value: String,
) : Transport {
    override suspend fun send(req: Request): Response =
        inner.send(req.copy(headers = req.headers + ("Authorization" to listOf(value))))
    override suspend fun openStream(req: Request): Stream =
        inner.openStream(req.copy(headers = req.headers + ("Authorization" to listOf(value))))
}
