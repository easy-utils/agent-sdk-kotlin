// Agent typed client SDK for Kotlin (agent.v1.AgentService) over easy-rpc.
// The generated AgentServiceClient wraps an easy_rpc Transport; this adds
// Bearer auth. The transport is platform-default (OkHttp on JVM, Ktor CIO on
// native, Ktor JS on web), so the same code runs on every target.
package agentsdk

import easyrpc.Transport
import easyrpc.connect
import agent.v1.ListPresetsRequest
import agent.v1.Preset

class AgentClient(
    baseUrl: String,
    token: String = "",
    transport: Transport? = null,
) {
    private val _rpc: AgentServiceClient

    init {
        val t = transport ?: connect(baseUrl, token = token)
        _rpc = AgentServiceClient(t)
    }

    fun client(): AgentServiceClient = _rpc

    suspend fun listPresets(locale: String): List<Preset> =
        _rpc.listPresets(ListPresetsRequest(locale = locale)).presets
}
