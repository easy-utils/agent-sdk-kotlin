package agentsdk

import agent.v1.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val c = AgentClient(baseUrl = "http://127.0.0.1:18080", token = "devtoken")
    val h = c.client().health(HealthRequest.getDefaultInstance())
    println("health ok=${h.ok} name=${h.name}")
    val p = c.client().listPresets(ListPresetsRequest.newBuilder().setLocale("zh").build())
    println("presets=${p.presetsList.map { it.id }}")
    val start = System.currentTimeMillis()
    val flow = c.client().watchSessions(WatchSessionsRequest.getDefaultInstance())
    try {
      flow.collect { m ->
        println("watchSessions first frame +${System.currentTimeMillis() - start}ms snapshot=${m.snapshot} upserts=${m.upsertsCount}")
        throw kotlinx.coroutines.CancellationException("done")
      }
    } catch (e: kotlinx.coroutines.CancellationException) { /* first frame seen */ }
}
