@file:OptIn(pbandk.PublicForGeneratedCode::class)

package agent.v1

@pbandk.Export
public data class Session(
    val name: String = "",
    val model: String = "",
    val preset: String = "",
    val tipId: String = "",
    val maxTurns: Int = 0,
    val systemPrompt: String = "",
    val inputTokens: Int = 0,
    val outputTokens: Int = 0,
    val totalTokens: Int = 0,
    val lastInputTokens: Int = 0,
    val lastOutputTokens: Int = 0,
    val createdAt: String = "",
    val updatedAt: String = "",
    val lastUsedAt: String = "",
    val locale: String = "",
    val org: String = "",
    val repo: String = "",
    val branch: String = "",
    val unreadCount: Int = 0,
    val lastMessageAt: String = "",
    val lastMessagePreview: String = "",
    val variant: String = "",
    val messageSeq: Int = 0,
    val group: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.Session = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.Session> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.Session> {
        public val defaultInstance: agent.v1.Session by lazy { agent.v1.Session() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.Session = agent.v1.Session.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.Session> = pbandk.MessageDescriptor(
            fullName = "agent.v1.Session",
            messageClass = agent.v1.Session::class,
            messageCompanion = this,
            fields = buildList(24) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.Session::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "model",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "model",
                        value = agent.v1.Session::model
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "preset",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "preset",
                        value = agent.v1.Session::preset
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tip_id",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tipId",
                        value = agent.v1.Session::tipId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_turns",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "maxTurns",
                        value = agent.v1.Session::maxTurns
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "system_prompt",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "systemPrompt",
                        value = agent.v1.Session::systemPrompt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "input_tokens",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "inputTokens",
                        value = agent.v1.Session::inputTokens
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "output_tokens",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "outputTokens",
                        value = agent.v1.Session::outputTokens
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "total_tokens",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "totalTokens",
                        value = agent.v1.Session::totalTokens
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_input_tokens",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "lastInputTokens",
                        value = agent.v1.Session::lastInputTokens
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_output_tokens",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "lastOutputTokens",
                        value = agent.v1.Session::lastOutputTokens
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "created_at",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "createdAt",
                        value = agent.v1.Session::createdAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "updated_at",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "updatedAt",
                        value = agent.v1.Session::updatedAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_used_at",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUsedAt",
                        value = agent.v1.Session::lastUsedAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "locale",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "locale",
                        value = agent.v1.Session::locale
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "org",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "org",
                        value = agent.v1.Session::org
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repo",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "repo",
                        value = agent.v1.Session::repo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "branch",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "branch",
                        value = agent.v1.Session::branch
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unread_count",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "unreadCount",
                        value = agent.v1.Session::unreadCount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_message_at",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastMessageAt",
                        value = agent.v1.Session::lastMessageAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_message_preview",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastMessagePreview",
                        value = agent.v1.Session::lastMessagePreview
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "variant",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "variant",
                        value = agent.v1.Session::variant
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_seq",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "messageSeq",
                        value = agent.v1.Session::messageSeq
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "group",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "group",
                        value = agent.v1.Session::group
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Message(
    val id: String = "",
    val role: String = "",
    val prevId: String = "",
    val createdAt: String = "",
    val parts: List<agent.v1.Part> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.Message = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.Message> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.Message> {
        public val defaultInstance: agent.v1.Message by lazy { agent.v1.Message() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.Message = agent.v1.Message.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.Message> = pbandk.MessageDescriptor(
            fullName = "agent.v1.Message",
            messageClass = agent.v1.Message::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.Message::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "role",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "role",
                        value = agent.v1.Message::role
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "prev_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "prevId",
                        value = agent.v1.Message::prevId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "created_at",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "createdAt",
                        value = agent.v1.Message::createdAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parts",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.Part>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Part.Companion)),
                        jsonName = "parts",
                        value = agent.v1.Message::parts
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Part(
    val id: String = "",
    val messageId: String = "",
    val type: String = "",
    val seq: Int = 0,
    val data: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.Part = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.Part> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.Part> {
        public val defaultInstance: agent.v1.Part by lazy { agent.v1.Part() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.Part = agent.v1.Part.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.Part> = pbandk.MessageDescriptor(
            fullName = "agent.v1.Part",
            messageClass = agent.v1.Part::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.Part::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "messageId",
                        value = agent.v1.Part::messageId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "type",
                        value = agent.v1.Part::type
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "seq",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "seq",
                        value = agent.v1.Part::seq
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "data",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "data",
                        value = agent.v1.Part::data
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MailboxEntry(
    val id: String = "",
    val sessionName: String = "",
    val msgType: String = "",
    val payload: String = "",
    val effectiveAt: String = "",
    val status: String = "",
    val createdAt: String = "",
    val consumedAt: String = "",
    val seq: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.MailboxEntry = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.MailboxEntry> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.MailboxEntry> {
        public val defaultInstance: agent.v1.MailboxEntry by lazy { agent.v1.MailboxEntry() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.MailboxEntry = agent.v1.MailboxEntry.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.MailboxEntry> = pbandk.MessageDescriptor(
            fullName = "agent.v1.MailboxEntry",
            messageClass = agent.v1.MailboxEntry::class,
            messageCompanion = this,
            fields = buildList(9) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.MailboxEntry::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionName",
                        value = agent.v1.MailboxEntry::sessionName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "msg_type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "msgType",
                        value = agent.v1.MailboxEntry::msgType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "payload",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "payload",
                        value = agent.v1.MailboxEntry::payload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "effective_at",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "effectiveAt",
                        value = agent.v1.MailboxEntry::effectiveAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "status",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "status",
                        value = agent.v1.MailboxEntry::status
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "created_at",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "createdAt",
                        value = agent.v1.MailboxEntry::createdAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "consumed_at",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "consumedAt",
                        value = agent.v1.MailboxEntry::consumedAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "seq",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "seq",
                        value = agent.v1.MailboxEntry::seq
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Preset(
    val id: String = "",
    val systemPrompt: String = "",
    val systemPromptI18n: String = "",
    val tools: List<String> = emptyList(),
    val maxTurns: Int = 0,
    val isSystem: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.Preset = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.Preset> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.Preset> {
        public val defaultInstance: agent.v1.Preset by lazy { agent.v1.Preset() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.Preset = agent.v1.Preset.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.Preset> = pbandk.MessageDescriptor(
            fullName = "agent.v1.Preset",
            messageClass = agent.v1.Preset::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.Preset::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "system_prompt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "systemPrompt",
                        value = agent.v1.Preset::systemPrompt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "system_prompt_i18n",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "systemPromptI18n",
                        value = agent.v1.Preset::systemPromptI18n
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tools",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "tools",
                        value = agent.v1.Preset::tools
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_turns",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "maxTurns",
                        value = agent.v1.Preset::maxTurns
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_system",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isSystem",
                        value = agent.v1.Preset::isSystem
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Provider(
    val providerId: String = "",
    val apiType: String = "",
    val baseUrl: String = "",
    val apiKey: String = "",
    val headers: Map<String, String> = emptyMap(),
    val models: List<agent.v1.ProviderModel> = emptyList(),
    val updatedAt: String = "",
    val capability: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.Provider = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.Provider> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.Provider> {
        public val defaultInstance: agent.v1.Provider by lazy { agent.v1.Provider() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.Provider = agent.v1.Provider.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.Provider> = pbandk.MessageDescriptor(
            fullName = "agent.v1.Provider",
            messageClass = agent.v1.Provider::class,
            messageCompanion = this,
            fields = buildList(8) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "provider_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "providerId",
                        value = agent.v1.Provider::providerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "api_type",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "apiType",
                        value = agent.v1.Provider::apiType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "base_url",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "baseUrl",
                        value = agent.v1.Provider::baseUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "api_key",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "apiKey",
                        value = agent.v1.Provider::apiKey
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "headers",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Map<String, String>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "headers",
                        value = agent.v1.Provider::headers
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "models",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.ProviderModel>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.ProviderModel.Companion)),
                        jsonName = "models",
                        value = agent.v1.Provider::models
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "updated_at",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "updatedAt",
                        value = agent.v1.Provider::updatedAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "capability",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "capability",
                        value = agent.v1.Provider::capability
                    )
                )
            }
        )
    }

    public data class HeadersEntry(
        override val key: String = "",
        override val value: String = "",
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, String> {
        override operator fun plus(other: pbandk.Message?): agent.v1.Provider.HeadersEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<agent.v1.Provider.HeadersEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<agent.v1.Provider.HeadersEntry> {
            public val defaultInstance: agent.v1.Provider.HeadersEntry by lazy { agent.v1.Provider.HeadersEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.Provider.HeadersEntry = agent.v1.Provider.HeadersEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<agent.v1.Provider.HeadersEntry> = pbandk.MessageDescriptor(
                fullName = "agent.v1.Provider.HeadersEntry",
                messageClass = agent.v1.Provider.HeadersEntry::class,
                messageCompanion = this,
                fields = buildList(2) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = agent.v1.Provider.HeadersEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = agent.v1.Provider.HeadersEntry::value
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class ProviderModel(
    val id: String = "",
    val name: String = "",
    val contextLimit: Long = 0L,
    val modelType: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ProviderModel = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ProviderModel> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ProviderModel> {
        public val defaultInstance: agent.v1.ProviderModel by lazy { agent.v1.ProviderModel() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ProviderModel = agent.v1.ProviderModel.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ProviderModel> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ProviderModel",
            messageClass = agent.v1.ProviderModel::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.ProviderModel::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.ProviderModel::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "context_limit",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "contextLimit",
                        value = agent.v1.ProviderModel::contextLimit
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "model_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "modelType",
                        value = agent.v1.ProviderModel::modelType
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ToolInfo(
    val name: String = "",
    val description: String = "",
    val category: String = "",
    val parameters: pbandk.wkt.Struct? = null,
    val configFields: List<agent.v1.ToolConfigField> = emptyList(),
    val requiredConfig: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ToolInfo = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ToolInfo> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ToolInfo> {
        public val defaultInstance: agent.v1.ToolInfo by lazy { agent.v1.ToolInfo() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ToolInfo = agent.v1.ToolInfo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ToolInfo> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ToolInfo",
            messageClass = agent.v1.ToolInfo::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.ToolInfo::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "description",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "description",
                        value = agent.v1.ToolInfo::description
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "category",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "category",
                        value = agent.v1.ToolInfo::category
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parameters",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        jsonName = "parameters",
                        value = agent.v1.ToolInfo::parameters
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "config_fields",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.ToolConfigField>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.ToolConfigField.Companion)),
                        jsonName = "configFields",
                        value = agent.v1.ToolInfo::configFields
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "required_config",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "requiredConfig",
                        value = agent.v1.ToolInfo::requiredConfig
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ToolConfigField(
    val name: String = "",
    val type: String = "",
    val enumValues: List<String> = emptyList(),
    val default: pbandk.wkt.Value? = null,
    val description: String = "",
    val scope: String = "",
    val kind: String = "",
    val capability: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ToolConfigField = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ToolConfigField> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ToolConfigField> {
        public val defaultInstance: agent.v1.ToolConfigField by lazy { agent.v1.ToolConfigField() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ToolConfigField = agent.v1.ToolConfigField.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ToolConfigField> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ToolConfigField",
            messageClass = agent.v1.ToolConfigField::class,
            messageCompanion = this,
            fields = buildList(8) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.ToolConfigField::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "type",
                        value = agent.v1.ToolConfigField::type
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum_values",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "enumValues",
                        value = agent.v1.ToolConfigField::enumValues
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "default",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion),
                        jsonName = "default",
                        value = agent.v1.ToolConfigField::default
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "description",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "description",
                        value = agent.v1.ToolConfigField::description
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scope",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "scope",
                        value = agent.v1.ToolConfigField::scope
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "kind",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "kind",
                        value = agent.v1.ToolConfigField::kind
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "capability",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "capability",
                        value = agent.v1.ToolConfigField::capability
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ToolConfig(
    val values: Map<String, pbandk.wkt.Value?> = emptyMap(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ToolConfig = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ToolConfig> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ToolConfig> {
        public val defaultInstance: agent.v1.ToolConfig by lazy { agent.v1.ToolConfig() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ToolConfig = agent.v1.ToolConfig.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ToolConfig> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ToolConfig",
            messageClass = agent.v1.ToolConfig::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "values",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.wkt.Value?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                        jsonName = "values",
                        value = agent.v1.ToolConfig::values
                    )
                )
            }
        )
    }

    public data class ValuesEntry(
        override val key: String = "",
        override val value: pbandk.wkt.Value? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.wkt.Value?> {
        override operator fun plus(other: pbandk.Message?): agent.v1.ToolConfig.ValuesEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<agent.v1.ToolConfig.ValuesEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<agent.v1.ToolConfig.ValuesEntry> {
            public val defaultInstance: agent.v1.ToolConfig.ValuesEntry by lazy { agent.v1.ToolConfig.ValuesEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ToolConfig.ValuesEntry = agent.v1.ToolConfig.ValuesEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<agent.v1.ToolConfig.ValuesEntry> = pbandk.MessageDescriptor(
                fullName = "agent.v1.ToolConfig.ValuesEntry",
                messageClass = agent.v1.ToolConfig.ValuesEntry::class,
                messageCompanion = this,
                fields = buildList(2) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = agent.v1.ToolConfig.ValuesEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion),
                            jsonName = "value",
                            value = agent.v1.ToolConfig.ValuesEntry::value
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class PromptResponse(
    val event: String = "",
    val params: Map<String, String> = emptyMap(),
    val eid: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.PromptResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.PromptResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.PromptResponse> {
        public val defaultInstance: agent.v1.PromptResponse by lazy { agent.v1.PromptResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.PromptResponse = agent.v1.PromptResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.PromptResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.PromptResponse",
            messageClass = agent.v1.PromptResponse::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "event",
                        value = agent.v1.PromptResponse::event
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "params",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Map<String, String>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "params",
                        value = agent.v1.PromptResponse::params
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "eid",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "eid",
                        value = agent.v1.PromptResponse::eid
                    )
                )
            }
        )
    }

    public data class ParamsEntry(
        override val key: String = "",
        override val value: String = "",
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, String> {
        override operator fun plus(other: pbandk.Message?): agent.v1.PromptResponse.ParamsEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<agent.v1.PromptResponse.ParamsEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<agent.v1.PromptResponse.ParamsEntry> {
            public val defaultInstance: agent.v1.PromptResponse.ParamsEntry by lazy { agent.v1.PromptResponse.ParamsEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.PromptResponse.ParamsEntry = agent.v1.PromptResponse.ParamsEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<agent.v1.PromptResponse.ParamsEntry> = pbandk.MessageDescriptor(
                fullName = "agent.v1.PromptResponse.ParamsEntry",
                messageClass = agent.v1.PromptResponse.ParamsEntry::class,
                messageCompanion = this,
                fields = buildList(2) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = agent.v1.PromptResponse.ParamsEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = agent.v1.PromptResponse.ParamsEntry::value
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class WatchSessionRequest(
    val id: String = "",
    val since: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.WatchSessionRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.WatchSessionRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.WatchSessionRequest> {
        public val defaultInstance: agent.v1.WatchSessionRequest by lazy { agent.v1.WatchSessionRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.WatchSessionRequest = agent.v1.WatchSessionRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.WatchSessionRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.WatchSessionRequest",
            messageClass = agent.v1.WatchSessionRequest::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.WatchSessionRequest::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "since",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "since",
                        value = agent.v1.WatchSessionRequest::since
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class WatchSessionResponse(
    val event: String = "",
    val params: pbandk.wkt.Struct? = null,
    val eid: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.WatchSessionResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.WatchSessionResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.WatchSessionResponse> {
        public val defaultInstance: agent.v1.WatchSessionResponse by lazy { agent.v1.WatchSessionResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.WatchSessionResponse = agent.v1.WatchSessionResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.WatchSessionResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.WatchSessionResponse",
            messageClass = agent.v1.WatchSessionResponse::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "event",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "event",
                        value = agent.v1.WatchSessionResponse::event
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "params",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        jsonName = "params",
                        value = agent.v1.WatchSessionResponse::params
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "eid",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "eid",
                        value = agent.v1.WatchSessionResponse::eid
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class WatchSessionsRequest(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.WatchSessionsRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.WatchSessionsRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.WatchSessionsRequest> {
        public val defaultInstance: agent.v1.WatchSessionsRequest by lazy { agent.v1.WatchSessionsRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.WatchSessionsRequest = agent.v1.WatchSessionsRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.WatchSessionsRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.WatchSessionsRequest",
            messageClass = agent.v1.WatchSessionsRequest::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class WatchSessionsResponse(
    val upserts: List<agent.v1.Session> = emptyList(),
    val removed: List<String> = emptyList(),
    val snapshot: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.WatchSessionsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.WatchSessionsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.WatchSessionsResponse> {
        public val defaultInstance: agent.v1.WatchSessionsResponse by lazy { agent.v1.WatchSessionsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.WatchSessionsResponse = agent.v1.WatchSessionsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.WatchSessionsResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.WatchSessionsResponse",
            messageClass = agent.v1.WatchSessionsResponse::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "upserts",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.Session>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Session.Companion)),
                        jsonName = "upserts",
                        value = agent.v1.WatchSessionsResponse::upserts
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "removed",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "removed",
                        value = agent.v1.WatchSessionsResponse::removed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "snapshot",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "snapshot",
                        value = agent.v1.WatchSessionsResponse::snapshot
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class FileRef(
    val code: String = "",
    val name: String = "",
    val size: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.FileRef = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.FileRef> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.FileRef> {
        public val defaultInstance: agent.v1.FileRef by lazy { agent.v1.FileRef() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.FileRef = agent.v1.FileRef.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.FileRef> = pbandk.MessageDescriptor(
            fullName = "agent.v1.FileRef",
            messageClass = agent.v1.FileRef::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "code",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "code",
                        value = agent.v1.FileRef::code
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.FileRef::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "size",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "size",
                        value = agent.v1.FileRef::size
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListSessionsRequest(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListSessionsRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListSessionsRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListSessionsRequest> {
        public val defaultInstance: agent.v1.ListSessionsRequest by lazy { agent.v1.ListSessionsRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListSessionsRequest = agent.v1.ListSessionsRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListSessionsRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListSessionsRequest",
            messageClass = agent.v1.ListSessionsRequest::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class ListSessionsResponse(
    val sessions: List<agent.v1.Session> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListSessionsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListSessionsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListSessionsResponse> {
        public val defaultInstance: agent.v1.ListSessionsResponse by lazy { agent.v1.ListSessionsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListSessionsResponse = agent.v1.ListSessionsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListSessionsResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListSessionsResponse",
            messageClass = agent.v1.ListSessionsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sessions",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.Session>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Session.Companion)),
                        jsonName = "sessions",
                        value = agent.v1.ListSessionsResponse::sessions
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class CreateSessionRequest(
    val name: String = "",
    val model: String = "",
    val preset: String = "",
    val org: String = "",
    val repo: String = "",
    val branch: String = "",
    val variant: String = "",
    val group: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.CreateSessionRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.CreateSessionRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.CreateSessionRequest> {
        public val defaultInstance: agent.v1.CreateSessionRequest by lazy { agent.v1.CreateSessionRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.CreateSessionRequest = agent.v1.CreateSessionRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.CreateSessionRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.CreateSessionRequest",
            messageClass = agent.v1.CreateSessionRequest::class,
            messageCompanion = this,
            fields = buildList(8) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.CreateSessionRequest::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "model",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "model",
                        value = agent.v1.CreateSessionRequest::model
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "preset",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "preset",
                        value = agent.v1.CreateSessionRequest::preset
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "org",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "org",
                        value = agent.v1.CreateSessionRequest::org
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repo",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "repo",
                        value = agent.v1.CreateSessionRequest::repo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "branch",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "branch",
                        value = agent.v1.CreateSessionRequest::branch
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "variant",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "variant",
                        value = agent.v1.CreateSessionRequest::variant
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "group",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "group",
                        value = agent.v1.CreateSessionRequest::group
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class CreateSessionResponse(
    val ok: Boolean = false,
    val sessionName: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.CreateSessionResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.CreateSessionResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.CreateSessionResponse> {
        public val defaultInstance: agent.v1.CreateSessionResponse by lazy { agent.v1.CreateSessionResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.CreateSessionResponse = agent.v1.CreateSessionResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.CreateSessionResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.CreateSessionResponse",
            messageClass = agent.v1.CreateSessionResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.CreateSessionResponse::ok
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session_name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "sessionName",
                        value = agent.v1.CreateSessionResponse::sessionName
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetSessionRequest(
    val id: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetSessionRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetSessionRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetSessionRequest> {
        public val defaultInstance: agent.v1.GetSessionRequest by lazy { agent.v1.GetSessionRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetSessionRequest = agent.v1.GetSessionRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetSessionRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetSessionRequest",
            messageClass = agent.v1.GetSessionRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.GetSessionRequest::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetSessionResponse(
    val session: agent.v1.Session? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetSessionResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetSessionResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetSessionResponse> {
        public val defaultInstance: agent.v1.GetSessionResponse by lazy { agent.v1.GetSessionResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetSessionResponse = agent.v1.GetSessionResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetSessionResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetSessionResponse",
            messageClass = agent.v1.GetSessionResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Session.Companion),
                        jsonName = "session",
                        value = agent.v1.GetSessionResponse::session
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DeleteSessionRequest(
    val id: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.DeleteSessionRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteSessionRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.DeleteSessionRequest> {
        public val defaultInstance: agent.v1.DeleteSessionRequest by lazy { agent.v1.DeleteSessionRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.DeleteSessionRequest = agent.v1.DeleteSessionRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteSessionRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.DeleteSessionRequest",
            messageClass = agent.v1.DeleteSessionRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.DeleteSessionRequest::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DeleteSessionResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.DeleteSessionResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteSessionResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.DeleteSessionResponse> {
        public val defaultInstance: agent.v1.DeleteSessionResponse by lazy { agent.v1.DeleteSessionResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.DeleteSessionResponse = agent.v1.DeleteSessionResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteSessionResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.DeleteSessionResponse",
            messageClass = agent.v1.DeleteSessionResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.DeleteSessionResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListMessagesRequest(
    val id: String = "",
    val limit: Int = 0,
    val before: String = "",
    val after: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListMessagesRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListMessagesRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListMessagesRequest> {
        public val defaultInstance: agent.v1.ListMessagesRequest by lazy { agent.v1.ListMessagesRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListMessagesRequest = agent.v1.ListMessagesRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListMessagesRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListMessagesRequest",
            messageClass = agent.v1.ListMessagesRequest::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.ListMessagesRequest::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "limit",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "limit",
                        value = agent.v1.ListMessagesRequest::limit
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "before",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "before",
                        value = agent.v1.ListMessagesRequest::before
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "after",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "after",
                        value = agent.v1.ListMessagesRequest::after
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListMessagesResponse(
    val ok: Boolean = false,
    val messages: List<agent.v1.Message> = emptyList(),
    val resync: Boolean = false,
    val tipId: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListMessagesResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListMessagesResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListMessagesResponse> {
        public val defaultInstance: agent.v1.ListMessagesResponse by lazy { agent.v1.ListMessagesResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListMessagesResponse = agent.v1.ListMessagesResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListMessagesResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListMessagesResponse",
            messageClass = agent.v1.ListMessagesResponse::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.ListMessagesResponse::ok
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "messages",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.Message>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Message.Companion)),
                        jsonName = "messages",
                        value = agent.v1.ListMessagesResponse::messages
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "resync",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "resync",
                        value = agent.v1.ListMessagesResponse::resync
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tip_id",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tipId",
                        value = agent.v1.ListMessagesResponse::tipId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PromptRequest(
    val id: String = "",
    val prompt: String = "",
    val attachments: List<agent.v1.FileRef> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.PromptRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.PromptRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.PromptRequest> {
        public val defaultInstance: agent.v1.PromptRequest by lazy { agent.v1.PromptRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.PromptRequest = agent.v1.PromptRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.PromptRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.PromptRequest",
            messageClass = agent.v1.PromptRequest::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.PromptRequest::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "prompt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "prompt",
                        value = agent.v1.PromptRequest::prompt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "attachments",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.FileRef>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.FileRef.Companion)),
                        jsonName = "attachments",
                        value = agent.v1.PromptRequest::attachments
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ForkRequest(
    val id: String = "",
    val name: String = "",
    val messageId: String = "",
    val preset: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ForkRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ForkRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ForkRequest> {
        public val defaultInstance: agent.v1.ForkRequest by lazy { agent.v1.ForkRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ForkRequest = agent.v1.ForkRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ForkRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ForkRequest",
            messageClass = agent.v1.ForkRequest::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.ForkRequest::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.ForkRequest::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_id",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "messageId",
                        value = agent.v1.ForkRequest::messageId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "preset",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "preset",
                        value = agent.v1.ForkRequest::preset
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ForkResponse(
    val session: agent.v1.Session? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ForkResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ForkResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ForkResponse> {
        public val defaultInstance: agent.v1.ForkResponse by lazy { agent.v1.ForkResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ForkResponse = agent.v1.ForkResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ForkResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ForkResponse",
            messageClass = agent.v1.ForkResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Session.Companion),
                        jsonName = "session",
                        value = agent.v1.ForkResponse::session
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RenameRequest(
    val id: String = "",
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.RenameRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.RenameRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.RenameRequest> {
        public val defaultInstance: agent.v1.RenameRequest by lazy { agent.v1.RenameRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.RenameRequest = agent.v1.RenameRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.RenameRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.RenameRequest",
            messageClass = agent.v1.RenameRequest::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.RenameRequest::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.RenameRequest::name
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RenameResponse(
    val session: agent.v1.Session? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.RenameResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.RenameResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.RenameResponse> {
        public val defaultInstance: agent.v1.RenameResponse by lazy { agent.v1.RenameResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.RenameResponse = agent.v1.RenameResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.RenameResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.RenameResponse",
            messageClass = agent.v1.RenameResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Session.Companion),
                        jsonName = "session",
                        value = agent.v1.RenameResponse::session
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SetModelRequest(
    val id: String = "",
    val model: String = "",
    val variant: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.SetModelRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.SetModelRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.SetModelRequest> {
        public val defaultInstance: agent.v1.SetModelRequest by lazy { agent.v1.SetModelRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.SetModelRequest = agent.v1.SetModelRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.SetModelRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.SetModelRequest",
            messageClass = agent.v1.SetModelRequest::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.SetModelRequest::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "model",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "model",
                        value = agent.v1.SetModelRequest::model
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "variant",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "variant",
                        value = agent.v1.SetModelRequest::variant
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SetModelResponse(
    val session: agent.v1.Session? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.SetModelResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.SetModelResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.SetModelResponse> {
        public val defaultInstance: agent.v1.SetModelResponse by lazy { agent.v1.SetModelResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.SetModelResponse = agent.v1.SetModelResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.SetModelResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.SetModelResponse",
            messageClass = agent.v1.SetModelResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Session.Companion),
                        jsonName = "session",
                        value = agent.v1.SetModelResponse::session
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class UndoRequest(
    val id: String = "",
    val messageId: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.UndoRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.UndoRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.UndoRequest> {
        public val defaultInstance: agent.v1.UndoRequest by lazy { agent.v1.UndoRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.UndoRequest = agent.v1.UndoRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.UndoRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.UndoRequest",
            messageClass = agent.v1.UndoRequest::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.UndoRequest::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "messageId",
                        value = agent.v1.UndoRequest::messageId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class UndoResponse(
    val session: agent.v1.Session? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.UndoResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.UndoResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.UndoResponse> {
        public val defaultInstance: agent.v1.UndoResponse by lazy { agent.v1.UndoResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.UndoResponse = agent.v1.UndoResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.UndoResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.UndoResponse",
            messageClass = agent.v1.UndoResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Session.Companion),
                        jsonName = "session",
                        value = agent.v1.UndoResponse::session
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class StateRequest(
    val id: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.StateRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.StateRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.StateRequest> {
        public val defaultInstance: agent.v1.StateRequest by lazy { agent.v1.StateRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.StateRequest = agent.v1.StateRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.StateRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.StateRequest",
            messageClass = agent.v1.StateRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.StateRequest::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class StateResponse(
    val state: pbandk.wkt.Struct? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.StateResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.StateResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.StateResponse> {
        public val defaultInstance: agent.v1.StateResponse by lazy { agent.v1.StateResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.StateResponse = agent.v1.StateResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.StateResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.StateResponse",
            messageClass = agent.v1.StateResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "state",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        jsonName = "state",
                        value = agent.v1.StateResponse::state
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MailboxRequest(
    val id: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.MailboxRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.MailboxRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.MailboxRequest> {
        public val defaultInstance: agent.v1.MailboxRequest by lazy { agent.v1.MailboxRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.MailboxRequest = agent.v1.MailboxRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.MailboxRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.MailboxRequest",
            messageClass = agent.v1.MailboxRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.MailboxRequest::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MailboxResponse(
    val ok: Boolean = false,
    val mailbox: List<agent.v1.MailboxEntry> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.MailboxResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.MailboxResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.MailboxResponse> {
        public val defaultInstance: agent.v1.MailboxResponse by lazy { agent.v1.MailboxResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.MailboxResponse = agent.v1.MailboxResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.MailboxResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.MailboxResponse",
            messageClass = agent.v1.MailboxResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.MailboxResponse::ok
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "mailbox",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.MailboxEntry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.MailboxEntry.Companion)),
                        jsonName = "mailbox",
                        value = agent.v1.MailboxResponse::mailbox
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class UpdateSettingsRequest(
    val id: String = "",
    val model: String = "",
    val preset: String = "",
    val systemPrompt: String = "",
    val locale: String = "",
    val variant: String = "",
    val maxTurns: Int? = null,
    val group: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.UpdateSettingsRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.UpdateSettingsRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.UpdateSettingsRequest> {
        public val defaultInstance: agent.v1.UpdateSettingsRequest by lazy { agent.v1.UpdateSettingsRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.UpdateSettingsRequest = agent.v1.UpdateSettingsRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.UpdateSettingsRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.UpdateSettingsRequest",
            messageClass = agent.v1.UpdateSettingsRequest::class,
            messageCompanion = this,
            fields = buildList(8) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.UpdateSettingsRequest::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "model",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "model",
                        value = agent.v1.UpdateSettingsRequest::model
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "preset",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "preset",
                        value = agent.v1.UpdateSettingsRequest::preset
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_turns",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "maxTurns",
                        value = agent.v1.UpdateSettingsRequest::maxTurns
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "system_prompt",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "systemPrompt",
                        value = agent.v1.UpdateSettingsRequest::systemPrompt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "locale",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "locale",
                        value = agent.v1.UpdateSettingsRequest::locale
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "variant",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "variant",
                        value = agent.v1.UpdateSettingsRequest::variant
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "group",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "group",
                        value = agent.v1.UpdateSettingsRequest::group
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class UpdateSettingsResponse(
    val session: agent.v1.Session? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.UpdateSettingsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.UpdateSettingsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.UpdateSettingsResponse> {
        public val defaultInstance: agent.v1.UpdateSettingsResponse by lazy { agent.v1.UpdateSettingsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.UpdateSettingsResponse = agent.v1.UpdateSettingsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.UpdateSettingsResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.UpdateSettingsResponse",
            messageClass = agent.v1.UpdateSettingsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "session",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Session.Companion),
                        jsonName = "session",
                        value = agent.v1.UpdateSettingsResponse::session
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class InterruptRequest(
    val id: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.InterruptRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.InterruptRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.InterruptRequest> {
        public val defaultInstance: agent.v1.InterruptRequest by lazy { agent.v1.InterruptRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.InterruptRequest = agent.v1.InterruptRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.InterruptRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.InterruptRequest",
            messageClass = agent.v1.InterruptRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.InterruptRequest::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class InterruptResponse(
    val ok: Boolean = false,
    val interrupted: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.InterruptResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.InterruptResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.InterruptResponse> {
        public val defaultInstance: agent.v1.InterruptResponse by lazy { agent.v1.InterruptResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.InterruptResponse = agent.v1.InterruptResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.InterruptResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.InterruptResponse",
            messageClass = agent.v1.InterruptResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.InterruptResponse::ok
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "interrupted",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "interrupted",
                        value = agent.v1.InterruptResponse::interrupted
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class CompactRequest(
    val id: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.CompactRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.CompactRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.CompactRequest> {
        public val defaultInstance: agent.v1.CompactRequest by lazy { agent.v1.CompactRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.CompactRequest = agent.v1.CompactRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.CompactRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.CompactRequest",
            messageClass = agent.v1.CompactRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.CompactRequest::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class CompactResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.CompactResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.CompactResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.CompactResponse> {
        public val defaultInstance: agent.v1.CompactResponse by lazy { agent.v1.CompactResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.CompactResponse = agent.v1.CompactResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.CompactResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.CompactResponse",
            messageClass = agent.v1.CompactResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.CompactResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListProvidersRequest(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListProvidersRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListProvidersRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListProvidersRequest> {
        public val defaultInstance: agent.v1.ListProvidersRequest by lazy { agent.v1.ListProvidersRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListProvidersRequest = agent.v1.ListProvidersRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListProvidersRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListProvidersRequest",
            messageClass = agent.v1.ListProvidersRequest::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class ListProvidersResponse(
    val providers: List<agent.v1.Provider> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListProvidersResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListProvidersResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListProvidersResponse> {
        public val defaultInstance: agent.v1.ListProvidersResponse by lazy { agent.v1.ListProvidersResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListProvidersResponse = agent.v1.ListProvidersResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListProvidersResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListProvidersResponse",
            messageClass = agent.v1.ListProvidersResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "providers",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.Provider>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Provider.Companion)),
                        jsonName = "providers",
                        value = agent.v1.ListProvidersResponse::providers
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListProvidersCatalogRequest(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListProvidersCatalogRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListProvidersCatalogRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListProvidersCatalogRequest> {
        public val defaultInstance: agent.v1.ListProvidersCatalogRequest by lazy { agent.v1.ListProvidersCatalogRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListProvidersCatalogRequest = agent.v1.ListProvidersCatalogRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListProvidersCatalogRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListProvidersCatalogRequest",
            messageClass = agent.v1.ListProvidersCatalogRequest::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class ListProvidersCatalogResponse(
    val apiTypes: Map<String, agent.v1.ApiTypeCatalog?> = emptyMap(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListProvidersCatalogResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListProvidersCatalogResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListProvidersCatalogResponse> {
        public val defaultInstance: agent.v1.ListProvidersCatalogResponse by lazy { agent.v1.ListProvidersCatalogResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListProvidersCatalogResponse = agent.v1.ListProvidersCatalogResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListProvidersCatalogResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListProvidersCatalogResponse",
            messageClass = agent.v1.ListProvidersCatalogResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "api_types",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, agent.v1.ApiTypeCatalog?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.ApiTypeCatalog.Companion)),
                        jsonName = "apiTypes",
                        value = agent.v1.ListProvidersCatalogResponse::apiTypes
                    )
                )
            }
        )
    }

    public data class ApiTypesEntry(
        override val key: String = "",
        override val value: agent.v1.ApiTypeCatalog? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, agent.v1.ApiTypeCatalog?> {
        override operator fun plus(other: pbandk.Message?): agent.v1.ListProvidersCatalogResponse.ApiTypesEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListProvidersCatalogResponse.ApiTypesEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<agent.v1.ListProvidersCatalogResponse.ApiTypesEntry> {
            public val defaultInstance: agent.v1.ListProvidersCatalogResponse.ApiTypesEntry by lazy { agent.v1.ListProvidersCatalogResponse.ApiTypesEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListProvidersCatalogResponse.ApiTypesEntry = agent.v1.ListProvidersCatalogResponse.ApiTypesEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<agent.v1.ListProvidersCatalogResponse.ApiTypesEntry> = pbandk.MessageDescriptor(
                fullName = "agent.v1.ListProvidersCatalogResponse.ApiTypesEntry",
                messageClass = agent.v1.ListProvidersCatalogResponse.ApiTypesEntry::class,
                messageCompanion = this,
                fields = buildList(2) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = agent.v1.ListProvidersCatalogResponse.ApiTypesEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.ApiTypeCatalog.Companion),
                            jsonName = "value",
                            value = agent.v1.ListProvidersCatalogResponse.ApiTypesEntry::value
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class ApiTypeCatalog(
    val capabilities: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ApiTypeCatalog = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ApiTypeCatalog> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ApiTypeCatalog> {
        public val defaultInstance: agent.v1.ApiTypeCatalog by lazy { agent.v1.ApiTypeCatalog() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ApiTypeCatalog = agent.v1.ApiTypeCatalog.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ApiTypeCatalog> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ApiTypeCatalog",
            messageClass = agent.v1.ApiTypeCatalog::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "capabilities",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "capabilities",
                        value = agent.v1.ApiTypeCatalog::capabilities
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RegisterProviderRequest(
    val provider: agent.v1.Provider? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.RegisterProviderRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.RegisterProviderRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.RegisterProviderRequest> {
        public val defaultInstance: agent.v1.RegisterProviderRequest by lazy { agent.v1.RegisterProviderRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.RegisterProviderRequest = agent.v1.RegisterProviderRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.RegisterProviderRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.RegisterProviderRequest",
            messageClass = agent.v1.RegisterProviderRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "provider",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Provider.Companion),
                        jsonName = "provider",
                        value = agent.v1.RegisterProviderRequest::provider
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RegisterProviderResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.RegisterProviderResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.RegisterProviderResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.RegisterProviderResponse> {
        public val defaultInstance: agent.v1.RegisterProviderResponse by lazy { agent.v1.RegisterProviderResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.RegisterProviderResponse = agent.v1.RegisterProviderResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.RegisterProviderResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.RegisterProviderResponse",
            messageClass = agent.v1.RegisterProviderResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.RegisterProviderResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DeleteProviderRequest(
    val providerId: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.DeleteProviderRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteProviderRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.DeleteProviderRequest> {
        public val defaultInstance: agent.v1.DeleteProviderRequest by lazy { agent.v1.DeleteProviderRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.DeleteProviderRequest = agent.v1.DeleteProviderRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteProviderRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.DeleteProviderRequest",
            messageClass = agent.v1.DeleteProviderRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "provider_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "providerId",
                        value = agent.v1.DeleteProviderRequest::providerId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DeleteProviderResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.DeleteProviderResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteProviderResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.DeleteProviderResponse> {
        public val defaultInstance: agent.v1.DeleteProviderResponse by lazy { agent.v1.DeleteProviderResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.DeleteProviderResponse = agent.v1.DeleteProviderResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteProviderResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.DeleteProviderResponse",
            messageClass = agent.v1.DeleteProviderResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.DeleteProviderResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class TestProviderRequest(
    val providerId: String = "",
    val apiType: String = "",
    val baseUrl: String = "",
    val apiKey: String = "",
    val model: String = "",
    val variant: String = "",
    val capability: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.TestProviderRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.TestProviderRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.TestProviderRequest> {
        public val defaultInstance: agent.v1.TestProviderRequest by lazy { agent.v1.TestProviderRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.TestProviderRequest = agent.v1.TestProviderRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.TestProviderRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.TestProviderRequest",
            messageClass = agent.v1.TestProviderRequest::class,
            messageCompanion = this,
            fields = buildList(7) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "provider_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "providerId",
                        value = agent.v1.TestProviderRequest::providerId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "api_type",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "apiType",
                        value = agent.v1.TestProviderRequest::apiType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "base_url",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "baseUrl",
                        value = agent.v1.TestProviderRequest::baseUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "api_key",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "apiKey",
                        value = agent.v1.TestProviderRequest::apiKey
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "model",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "model",
                        value = agent.v1.TestProviderRequest::model
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "variant",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "variant",
                        value = agent.v1.TestProviderRequest::variant
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "capability",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "capability",
                        value = agent.v1.TestProviderRequest::capability
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class TestProviderResponse(
    val ok: Boolean = false,
    val result: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.TestProviderResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.TestProviderResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.TestProviderResponse> {
        public val defaultInstance: agent.v1.TestProviderResponse by lazy { agent.v1.TestProviderResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.TestProviderResponse = agent.v1.TestProviderResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.TestProviderResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.TestProviderResponse",
            messageClass = agent.v1.TestProviderResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.TestProviderResponse::ok
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "result",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "result",
                        value = agent.v1.TestProviderResponse::result
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListModelsRequest(
    val providerId: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListModelsRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListModelsRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListModelsRequest> {
        public val defaultInstance: agent.v1.ListModelsRequest by lazy { agent.v1.ListModelsRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListModelsRequest = agent.v1.ListModelsRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListModelsRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListModelsRequest",
            messageClass = agent.v1.ListModelsRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "provider_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "providerId",
                        value = agent.v1.ListModelsRequest::providerId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListModelsResponse(
    val models: List<agent.v1.ModelInfo> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListModelsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListModelsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListModelsResponse> {
        public val defaultInstance: agent.v1.ListModelsResponse by lazy { agent.v1.ListModelsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListModelsResponse = agent.v1.ListModelsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListModelsResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListModelsResponse",
            messageClass = agent.v1.ListModelsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "models",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.ModelInfo>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.ModelInfo.Companion)),
                        jsonName = "models",
                        value = agent.v1.ListModelsResponse::models
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ModelInfo(
    val id: String = "",
    val name: String = "",
    val variants: List<agent.v1.ModelVariant> = emptyList(),
    val contextLimit: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ModelInfo = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ModelInfo> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ModelInfo> {
        public val defaultInstance: agent.v1.ModelInfo by lazy { agent.v1.ModelInfo() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ModelInfo = agent.v1.ModelInfo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ModelInfo> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ModelInfo",
            messageClass = agent.v1.ModelInfo::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.ModelInfo::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.ModelInfo::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "variants",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.ModelVariant>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.ModelVariant.Companion)),
                        jsonName = "variants",
                        value = agent.v1.ModelInfo::variants
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "context_limit",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "contextLimit",
                        value = agent.v1.ModelInfo::contextLimit
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ModelVariant(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ModelVariant = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ModelVariant> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ModelVariant> {
        public val defaultInstance: agent.v1.ModelVariant by lazy { agent.v1.ModelVariant() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ModelVariant = agent.v1.ModelVariant.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ModelVariant> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ModelVariant",
            messageClass = agent.v1.ModelVariant::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.ModelVariant::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.ModelVariant::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "description",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "description",
                        value = agent.v1.ModelVariant::description
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListPresetsRequest(
    val locale: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListPresetsRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListPresetsRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListPresetsRequest> {
        public val defaultInstance: agent.v1.ListPresetsRequest by lazy { agent.v1.ListPresetsRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListPresetsRequest = agent.v1.ListPresetsRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListPresetsRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListPresetsRequest",
            messageClass = agent.v1.ListPresetsRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "locale",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "locale",
                        value = agent.v1.ListPresetsRequest::locale
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListPresetsResponse(
    val presets: List<agent.v1.Preset> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListPresetsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListPresetsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListPresetsResponse> {
        public val defaultInstance: agent.v1.ListPresetsResponse by lazy { agent.v1.ListPresetsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListPresetsResponse = agent.v1.ListPresetsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListPresetsResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListPresetsResponse",
            messageClass = agent.v1.ListPresetsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "presets",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.Preset>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Preset.Companion)),
                        jsonName = "presets",
                        value = agent.v1.ListPresetsResponse::presets
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class UpsertPresetRequest(
    val preset: agent.v1.Preset? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.UpsertPresetRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.UpsertPresetRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.UpsertPresetRequest> {
        public val defaultInstance: agent.v1.UpsertPresetRequest by lazy { agent.v1.UpsertPresetRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.UpsertPresetRequest = agent.v1.UpsertPresetRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.UpsertPresetRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.UpsertPresetRequest",
            messageClass = agent.v1.UpsertPresetRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "preset",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Preset.Companion),
                        jsonName = "preset",
                        value = agent.v1.UpsertPresetRequest::preset
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class UpsertPresetResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.UpsertPresetResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.UpsertPresetResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.UpsertPresetResponse> {
        public val defaultInstance: agent.v1.UpsertPresetResponse by lazy { agent.v1.UpsertPresetResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.UpsertPresetResponse = agent.v1.UpsertPresetResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.UpsertPresetResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.UpsertPresetResponse",
            messageClass = agent.v1.UpsertPresetResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.UpsertPresetResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DeletePresetRequest(
    val id: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.DeletePresetRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.DeletePresetRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.DeletePresetRequest> {
        public val defaultInstance: agent.v1.DeletePresetRequest by lazy { agent.v1.DeletePresetRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.DeletePresetRequest = agent.v1.DeletePresetRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.DeletePresetRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.DeletePresetRequest",
            messageClass = agent.v1.DeletePresetRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.DeletePresetRequest::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DeletePresetResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.DeletePresetResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.DeletePresetResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.DeletePresetResponse> {
        public val defaultInstance: agent.v1.DeletePresetResponse by lazy { agent.v1.DeletePresetResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.DeletePresetResponse = agent.v1.DeletePresetResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.DeletePresetResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.DeletePresetResponse",
            messageClass = agent.v1.DeletePresetResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.DeletePresetResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PreviewPresetRequest(
    val id: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.PreviewPresetRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.PreviewPresetRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.PreviewPresetRequest> {
        public val defaultInstance: agent.v1.PreviewPresetRequest by lazy { agent.v1.PreviewPresetRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.PreviewPresetRequest = agent.v1.PreviewPresetRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.PreviewPresetRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.PreviewPresetRequest",
            messageClass = agent.v1.PreviewPresetRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.PreviewPresetRequest::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class PreviewPresetResponse(
    val template: String = "",
    val rendered: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.PreviewPresetResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.PreviewPresetResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.PreviewPresetResponse> {
        public val defaultInstance: agent.v1.PreviewPresetResponse by lazy { agent.v1.PreviewPresetResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.PreviewPresetResponse = agent.v1.PreviewPresetResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.PreviewPresetResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.PreviewPresetResponse",
            messageClass = agent.v1.PreviewPresetResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "template",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "template",
                        value = agent.v1.PreviewPresetResponse::template
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rendered",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "rendered",
                        value = agent.v1.PreviewPresetResponse::rendered
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetConfigRequest(
    val key: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetConfigRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetConfigRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetConfigRequest> {
        public val defaultInstance: agent.v1.GetConfigRequest by lazy { agent.v1.GetConfigRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetConfigRequest = agent.v1.GetConfigRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetConfigRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetConfigRequest",
            messageClass = agent.v1.GetConfigRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "key",
                        value = agent.v1.GetConfigRequest::key
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetConfigResponse(
    val key: String = "",
    val value: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetConfigResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetConfigResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetConfigResponse> {
        public val defaultInstance: agent.v1.GetConfigResponse by lazy { agent.v1.GetConfigResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetConfigResponse = agent.v1.GetConfigResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetConfigResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetConfigResponse",
            messageClass = agent.v1.GetConfigResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "key",
                        value = agent.v1.GetConfigResponse::key
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = agent.v1.GetConfigResponse::value
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SetConfigRequest(
    val key: String = "",
    val value: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.SetConfigRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.SetConfigRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.SetConfigRequest> {
        public val defaultInstance: agent.v1.SetConfigRequest by lazy { agent.v1.SetConfigRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.SetConfigRequest = agent.v1.SetConfigRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.SetConfigRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.SetConfigRequest",
            messageClass = agent.v1.SetConfigRequest::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "key",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "key",
                        value = agent.v1.SetConfigRequest::key
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = agent.v1.SetConfigRequest::value
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SetConfigResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.SetConfigResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.SetConfigResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.SetConfigResponse> {
        public val defaultInstance: agent.v1.SetConfigResponse by lazy { agent.v1.SetConfigResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.SetConfigResponse = agent.v1.SetConfigResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.SetConfigResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.SetConfigResponse",
            messageClass = agent.v1.SetConfigResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.SetConfigResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListToolsRequest(
    val locale: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListToolsRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListToolsRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListToolsRequest> {
        public val defaultInstance: agent.v1.ListToolsRequest by lazy { agent.v1.ListToolsRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListToolsRequest = agent.v1.ListToolsRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListToolsRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListToolsRequest",
            messageClass = agent.v1.ListToolsRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "locale",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "locale",
                        value = agent.v1.ListToolsRequest::locale
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListToolsResponse(
    val tools: List<agent.v1.ToolInfo> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListToolsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListToolsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListToolsResponse> {
        public val defaultInstance: agent.v1.ListToolsResponse by lazy { agent.v1.ListToolsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListToolsResponse = agent.v1.ListToolsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListToolsResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListToolsResponse",
            messageClass = agent.v1.ListToolsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tools",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.ToolInfo>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.ToolInfo.Companion)),
                        jsonName = "tools",
                        value = agent.v1.ListToolsResponse::tools
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetToolConfigRequest(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetToolConfigRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetToolConfigRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetToolConfigRequest> {
        public val defaultInstance: agent.v1.GetToolConfigRequest by lazy { agent.v1.GetToolConfigRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetToolConfigRequest = agent.v1.GetToolConfigRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetToolConfigRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetToolConfigRequest",
            messageClass = agent.v1.GetToolConfigRequest::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class GetToolConfigResponse(
    val config: agent.v1.ToolConfig? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetToolConfigResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetToolConfigResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetToolConfigResponse> {
        public val defaultInstance: agent.v1.GetToolConfigResponse by lazy { agent.v1.GetToolConfigResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetToolConfigResponse = agent.v1.GetToolConfigResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetToolConfigResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetToolConfigResponse",
            messageClass = agent.v1.GetToolConfigResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "config",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.ToolConfig.Companion),
                        jsonName = "config",
                        value = agent.v1.GetToolConfigResponse::config
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SetToolConfigRequest(
    val config: pbandk.wkt.Struct? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.SetToolConfigRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.SetToolConfigRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.SetToolConfigRequest> {
        public val defaultInstance: agent.v1.SetToolConfigRequest by lazy { agent.v1.SetToolConfigRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.SetToolConfigRequest = agent.v1.SetToolConfigRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.SetToolConfigRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.SetToolConfigRequest",
            messageClass = agent.v1.SetToolConfigRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "config",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        jsonName = "config",
                        value = agent.v1.SetToolConfigRequest::config
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SetToolConfigResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.SetToolConfigResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.SetToolConfigResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.SetToolConfigResponse> {
        public val defaultInstance: agent.v1.SetToolConfigResponse by lazy { agent.v1.SetToolConfigResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.SetToolConfigResponse = agent.v1.SetToolConfigResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.SetToolConfigResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.SetToolConfigResponse",
            messageClass = agent.v1.SetToolConfigResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.SetToolConfigResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SetExtensionConfigRequest(
    val extId: String = "",
    val name: String = "",
    val value: pbandk.wkt.Value? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.SetExtensionConfigRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.SetExtensionConfigRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.SetExtensionConfigRequest> {
        public val defaultInstance: agent.v1.SetExtensionConfigRequest by lazy { agent.v1.SetExtensionConfigRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.SetExtensionConfigRequest = agent.v1.SetExtensionConfigRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.SetExtensionConfigRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.SetExtensionConfigRequest",
            messageClass = agent.v1.SetExtensionConfigRequest::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ext_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "extId",
                        value = agent.v1.SetExtensionConfigRequest::extId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.SetExtensionConfigRequest::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion),
                        jsonName = "value",
                        value = agent.v1.SetExtensionConfigRequest::value
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class SetExtensionConfigResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.SetExtensionConfigResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.SetExtensionConfigResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.SetExtensionConfigResponse> {
        public val defaultInstance: agent.v1.SetExtensionConfigResponse by lazy { agent.v1.SetExtensionConfigResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.SetExtensionConfigResponse = agent.v1.SetExtensionConfigResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.SetExtensionConfigResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.SetExtensionConfigResponse",
            messageClass = agent.v1.SetExtensionConfigResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.SetExtensionConfigResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class UploadFileRequest(
    val file: agent.v1.FileRef? = null,
    val data: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.UploadFileRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.UploadFileRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.UploadFileRequest> {
        public val defaultInstance: agent.v1.UploadFileRequest by lazy { agent.v1.UploadFileRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.UploadFileRequest = agent.v1.UploadFileRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.UploadFileRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.UploadFileRequest",
            messageClass = agent.v1.UploadFileRequest::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.FileRef.Companion),
                        jsonName = "file",
                        value = agent.v1.UploadFileRequest::file
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "data",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "data",
                        value = agent.v1.UploadFileRequest::data
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class UploadFileResponse(
    val ok: Boolean = false,
    val code: String = "",
    val mime: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.UploadFileResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.UploadFileResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.UploadFileResponse> {
        public val defaultInstance: agent.v1.UploadFileResponse by lazy { agent.v1.UploadFileResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.UploadFileResponse = agent.v1.UploadFileResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.UploadFileResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.UploadFileResponse",
            messageClass = agent.v1.UploadFileResponse::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.UploadFileResponse::ok
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "code",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "code",
                        value = agent.v1.UploadFileResponse::code
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "mime",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "mime",
                        value = agent.v1.UploadFileResponse::mime
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class IngestFileRequest(
    val code: String = "",
    val data: pbandk.ByteArr = pbandk.ByteArr.empty,
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.IngestFileRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.IngestFileRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.IngestFileRequest> {
        public val defaultInstance: agent.v1.IngestFileRequest by lazy { agent.v1.IngestFileRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.IngestFileRequest = agent.v1.IngestFileRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.IngestFileRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.IngestFileRequest",
            messageClass = agent.v1.IngestFileRequest::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "code",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "code",
                        value = agent.v1.IngestFileRequest::code
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "data",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "data",
                        value = agent.v1.IngestFileRequest::data
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.IngestFileRequest::name
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class IngestFileResponse(
    val ok: Boolean = false,
    val code: String = "",
    val mime: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.IngestFileResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.IngestFileResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.IngestFileResponse> {
        public val defaultInstance: agent.v1.IngestFileResponse by lazy { agent.v1.IngestFileResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.IngestFileResponse = agent.v1.IngestFileResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.IngestFileResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.IngestFileResponse",
            messageClass = agent.v1.IngestFileResponse::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.IngestFileResponse::ok
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "code",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "code",
                        value = agent.v1.IngestFileResponse::code
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "mime",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "mime",
                        value = agent.v1.IngestFileResponse::mime
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetFileRequest(
    val code: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetFileRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetFileRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetFileRequest> {
        public val defaultInstance: agent.v1.GetFileRequest by lazy { agent.v1.GetFileRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetFileRequest = agent.v1.GetFileRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetFileRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetFileRequest",
            messageClass = agent.v1.GetFileRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "code",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "code",
                        value = agent.v1.GetFileRequest::code
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetFileResponse(
    val data: pbandk.ByteArr = pbandk.ByteArr.empty,
    val name: String = "",
    val mime: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetFileResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetFileResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetFileResponse> {
        public val defaultInstance: agent.v1.GetFileResponse by lazy { agent.v1.GetFileResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetFileResponse = agent.v1.GetFileResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetFileResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetFileResponse",
            messageClass = agent.v1.GetFileResponse::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "data",
                        value = agent.v1.GetFileResponse::data
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.GetFileResponse::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "mime",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "mime",
                        value = agent.v1.GetFileResponse::mime
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetFileMetaRequest(
    val code: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetFileMetaRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetFileMetaRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetFileMetaRequest> {
        public val defaultInstance: agent.v1.GetFileMetaRequest by lazy { agent.v1.GetFileMetaRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetFileMetaRequest = agent.v1.GetFileMetaRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetFileMetaRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetFileMetaRequest",
            messageClass = agent.v1.GetFileMetaRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "code",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "code",
                        value = agent.v1.GetFileMetaRequest::code
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetFileMetaResponse(
    val name: String = "",
    val mime: String = "",
    val size: Int = 0,
    val width: Int? = null,
    val height: Int? = null,
    val durationMs: Long? = null,
    val thumbCode: String? = null,
    val thumbhash: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetFileMetaResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetFileMetaResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetFileMetaResponse> {
        public val defaultInstance: agent.v1.GetFileMetaResponse by lazy { agent.v1.GetFileMetaResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetFileMetaResponse = agent.v1.GetFileMetaResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetFileMetaResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetFileMetaResponse",
            messageClass = agent.v1.GetFileMetaResponse::class,
            messageCompanion = this,
            fields = buildList(8) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.GetFileMetaResponse::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "mime",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "mime",
                        value = agent.v1.GetFileMetaResponse::mime
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "size",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "size",
                        value = agent.v1.GetFileMetaResponse::size
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "width",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "width",
                        value = agent.v1.GetFileMetaResponse::width
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "height",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "height",
                        value = agent.v1.GetFileMetaResponse::height
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "duration_ms",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "durationMs",
                        value = agent.v1.GetFileMetaResponse::durationMs
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "thumb_code",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "thumbCode",
                        value = agent.v1.GetFileMetaResponse::thumbCode
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "thumbhash",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "thumbhash",
                        value = agent.v1.GetFileMetaResponse::thumbhash
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class FileChunk(
    val data: pbandk.ByteArr = pbandk.ByteArr.empty,
    val offset: Long = 0L,
    val total: Long = 0L,
    val last: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.FileChunk = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.FileChunk> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.FileChunk> {
        public val defaultInstance: agent.v1.FileChunk by lazy { agent.v1.FileChunk() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.FileChunk = agent.v1.FileChunk.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.FileChunk> = pbandk.MessageDescriptor(
            fullName = "agent.v1.FileChunk",
            messageClass = agent.v1.FileChunk::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "data",
                        value = agent.v1.FileChunk::data
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "offset",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "offset",
                        value = agent.v1.FileChunk::offset
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "total",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "total",
                        value = agent.v1.FileChunk::total
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "last",
                        value = agent.v1.FileChunk::last
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class GetAgentConfigRequest(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetAgentConfigRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetAgentConfigRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetAgentConfigRequest> {
        public val defaultInstance: agent.v1.GetAgentConfigRequest by lazy { agent.v1.GetAgentConfigRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetAgentConfigRequest = agent.v1.GetAgentConfigRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetAgentConfigRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetAgentConfigRequest",
            messageClass = agent.v1.GetAgentConfigRequest::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class GetAgentConfigResponse(
    val config: pbandk.wkt.Struct? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.GetAgentConfigResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.GetAgentConfigResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.GetAgentConfigResponse> {
        public val defaultInstance: agent.v1.GetAgentConfigResponse by lazy { agent.v1.GetAgentConfigResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.GetAgentConfigResponse = agent.v1.GetAgentConfigResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.GetAgentConfigResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.GetAgentConfigResponse",
            messageClass = agent.v1.GetAgentConfigResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "config",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        jsonName = "config",
                        value = agent.v1.GetAgentConfigResponse::config
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class HealthRequest(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.HealthRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.HealthRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.HealthRequest> {
        public val defaultInstance: agent.v1.HealthRequest by lazy { agent.v1.HealthRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.HealthRequest = agent.v1.HealthRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.HealthRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.HealthRequest",
            messageClass = agent.v1.HealthRequest::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class HealthResponse(
    val ok: Boolean = false,
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.HealthResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.HealthResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.HealthResponse> {
        public val defaultInstance: agent.v1.HealthResponse by lazy { agent.v1.HealthResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.HealthResponse = agent.v1.HealthResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.HealthResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.HealthResponse",
            messageClass = agent.v1.HealthResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.HealthResponse::ok
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.HealthResponse::name
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Tenant(
    val id: String = "",
    val name: String = "",
    val disabled: Boolean = false,
    val createdAt: String = "",
    val updatedAt: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.Tenant = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.Tenant> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.Tenant> {
        public val defaultInstance: agent.v1.Tenant by lazy { agent.v1.Tenant() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.Tenant = agent.v1.Tenant.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.Tenant> = pbandk.MessageDescriptor(
            fullName = "agent.v1.Tenant",
            messageClass = agent.v1.Tenant::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.Tenant::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.Tenant::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "disabled",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "disabled",
                        value = agent.v1.Tenant::disabled
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "created_at",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "createdAt",
                        value = agent.v1.Tenant::createdAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "updated_at",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "updatedAt",
                        value = agent.v1.Tenant::updatedAt
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class TenantToken(
    val tokenId: String = "",
    val tenantId: String = "",
    val label: String = "",
    val createdAt: String = "",
    val lastUsedAt: String = "",
    val revoked: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.TenantToken = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.TenantToken> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.TenantToken> {
        public val defaultInstance: agent.v1.TenantToken by lazy { agent.v1.TenantToken() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.TenantToken = agent.v1.TenantToken.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.TenantToken> = pbandk.MessageDescriptor(
            fullName = "agent.v1.TenantToken",
            messageClass = agent.v1.TenantToken::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tokenId",
                        value = agent.v1.TenantToken::tokenId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenant_id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenantId",
                        value = agent.v1.TenantToken::tenantId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "label",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "label",
                        value = agent.v1.TenantToken::label
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "created_at",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "createdAt",
                        value = agent.v1.TenantToken::createdAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_used_at",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "lastUsedAt",
                        value = agent.v1.TenantToken::lastUsedAt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "revoked",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "revoked",
                        value = agent.v1.TenantToken::revoked
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListTenantsRequest(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListTenantsRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListTenantsRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListTenantsRequest> {
        public val defaultInstance: agent.v1.ListTenantsRequest by lazy { agent.v1.ListTenantsRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListTenantsRequest = agent.v1.ListTenantsRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListTenantsRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListTenantsRequest",
            messageClass = agent.v1.ListTenantsRequest::class,
            messageCompanion = this,
            fields = buildList(0) {
            }
        )
    }
}

@pbandk.Export
public data class ListTenantsResponse(
    val tenants: List<agent.v1.Tenant> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListTenantsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListTenantsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListTenantsResponse> {
        public val defaultInstance: agent.v1.ListTenantsResponse by lazy { agent.v1.ListTenantsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListTenantsResponse = agent.v1.ListTenantsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListTenantsResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListTenantsResponse",
            messageClass = agent.v1.ListTenantsResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenants",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.Tenant>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Tenant.Companion)),
                        jsonName = "tenants",
                        value = agent.v1.ListTenantsResponse::tenants
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class CreateTenantRequest(
    val id: String = "",
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.CreateTenantRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.CreateTenantRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.CreateTenantRequest> {
        public val defaultInstance: agent.v1.CreateTenantRequest by lazy { agent.v1.CreateTenantRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.CreateTenantRequest = agent.v1.CreateTenantRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.CreateTenantRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.CreateTenantRequest",
            messageClass = agent.v1.CreateTenantRequest::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.CreateTenantRequest::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = agent.v1.CreateTenantRequest::name
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class CreateTenantResponse(
    val tenant: agent.v1.Tenant? = null,
    val token: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.CreateTenantResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.CreateTenantResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.CreateTenantResponse> {
        public val defaultInstance: agent.v1.CreateTenantResponse by lazy { agent.v1.CreateTenantResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.CreateTenantResponse = agent.v1.CreateTenantResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.CreateTenantResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.CreateTenantResponse",
            messageClass = agent.v1.CreateTenantResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenant",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Tenant.Companion),
                        jsonName = "tenant",
                        value = agent.v1.CreateTenantResponse::tenant
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "token",
                        value = agent.v1.CreateTenantResponse::token
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class UpdateTenantRequest(
    val id: String = "",
    val name: String? = null,
    val disabled: Boolean? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.UpdateTenantRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.UpdateTenantRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.UpdateTenantRequest> {
        public val defaultInstance: agent.v1.UpdateTenantRequest by lazy { agent.v1.UpdateTenantRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.UpdateTenantRequest = agent.v1.UpdateTenantRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.UpdateTenantRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.UpdateTenantRequest",
            messageClass = agent.v1.UpdateTenantRequest::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.UpdateTenantRequest::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = agent.v1.UpdateTenantRequest::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "disabled",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "disabled",
                        value = agent.v1.UpdateTenantRequest::disabled
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class UpdateTenantResponse(
    val tenant: agent.v1.Tenant? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.UpdateTenantResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.UpdateTenantResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.UpdateTenantResponse> {
        public val defaultInstance: agent.v1.UpdateTenantResponse by lazy { agent.v1.UpdateTenantResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.UpdateTenantResponse = agent.v1.UpdateTenantResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.UpdateTenantResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.UpdateTenantResponse",
            messageClass = agent.v1.UpdateTenantResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenant",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.Tenant.Companion),
                        jsonName = "tenant",
                        value = agent.v1.UpdateTenantResponse::tenant
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DeleteTenantRequest(
    val id: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.DeleteTenantRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteTenantRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.DeleteTenantRequest> {
        public val defaultInstance: agent.v1.DeleteTenantRequest by lazy { agent.v1.DeleteTenantRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.DeleteTenantRequest = agent.v1.DeleteTenantRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteTenantRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.DeleteTenantRequest",
            messageClass = agent.v1.DeleteTenantRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = agent.v1.DeleteTenantRequest::id
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DeleteTenantResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.DeleteTenantResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteTenantResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.DeleteTenantResponse> {
        public val defaultInstance: agent.v1.DeleteTenantResponse by lazy { agent.v1.DeleteTenantResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.DeleteTenantResponse = agent.v1.DeleteTenantResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.DeleteTenantResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.DeleteTenantResponse",
            messageClass = agent.v1.DeleteTenantResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.DeleteTenantResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class IssueTenantTokenRequest(
    val tenantId: String = "",
    val label: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.IssueTenantTokenRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.IssueTenantTokenRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.IssueTenantTokenRequest> {
        public val defaultInstance: agent.v1.IssueTenantTokenRequest by lazy { agent.v1.IssueTenantTokenRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.IssueTenantTokenRequest = agent.v1.IssueTenantTokenRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.IssueTenantTokenRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.IssueTenantTokenRequest",
            messageClass = agent.v1.IssueTenantTokenRequest::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenant_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenantId",
                        value = agent.v1.IssueTenantTokenRequest::tenantId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "label",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "label",
                        value = agent.v1.IssueTenantTokenRequest::label
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class IssueTenantTokenResponse(
    val token: agent.v1.TenantToken? = null,
    val plaintext: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.IssueTenantTokenResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.IssueTenantTokenResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.IssueTenantTokenResponse> {
        public val defaultInstance: agent.v1.IssueTenantTokenResponse by lazy { agent.v1.IssueTenantTokenResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.IssueTenantTokenResponse = agent.v1.IssueTenantTokenResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.IssueTenantTokenResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.IssueTenantTokenResponse",
            messageClass = agent.v1.IssueTenantTokenResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.TenantToken.Companion),
                        jsonName = "token",
                        value = agent.v1.IssueTenantTokenResponse::token
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "plaintext",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "plaintext",
                        value = agent.v1.IssueTenantTokenResponse::plaintext
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListTenantTokensRequest(
    val tenantId: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListTenantTokensRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListTenantTokensRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListTenantTokensRequest> {
        public val defaultInstance: agent.v1.ListTenantTokensRequest by lazy { agent.v1.ListTenantTokensRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListTenantTokensRequest = agent.v1.ListTenantTokensRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListTenantTokensRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListTenantTokensRequest",
            messageClass = agent.v1.ListTenantTokensRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tenant_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tenantId",
                        value = agent.v1.ListTenantTokensRequest::tenantId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListTenantTokensResponse(
    val tokens: List<agent.v1.TenantToken> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.ListTenantTokensResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.ListTenantTokensResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.ListTenantTokensResponse> {
        public val defaultInstance: agent.v1.ListTenantTokensResponse by lazy { agent.v1.ListTenantTokensResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.ListTenantTokensResponse = agent.v1.ListTenantTokensResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.ListTenantTokensResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.ListTenantTokensResponse",
            messageClass = agent.v1.ListTenantTokensResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tokens",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<agent.v1.TenantToken>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.TenantToken.Companion)),
                        jsonName = "tokens",
                        value = agent.v1.ListTenantTokensResponse::tokens
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RevokeTenantTokenRequest(
    val tokenId: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.RevokeTenantTokenRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.RevokeTenantTokenRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.RevokeTenantTokenRequest> {
        public val defaultInstance: agent.v1.RevokeTenantTokenRequest by lazy { agent.v1.RevokeTenantTokenRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.RevokeTenantTokenRequest = agent.v1.RevokeTenantTokenRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.RevokeTenantTokenRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.RevokeTenantTokenRequest",
            messageClass = agent.v1.RevokeTenantTokenRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tokenId",
                        value = agent.v1.RevokeTenantTokenRequest::tokenId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RevokeTenantTokenResponse(
    val ok: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.RevokeTenantTokenResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.RevokeTenantTokenResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.RevokeTenantTokenResponse> {
        public val defaultInstance: agent.v1.RevokeTenantTokenResponse by lazy { agent.v1.RevokeTenantTokenResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.RevokeTenantTokenResponse = agent.v1.RevokeTenantTokenResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.RevokeTenantTokenResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.RevokeTenantTokenResponse",
            messageClass = agent.v1.RevokeTenantTokenResponse::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ok",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "ok",
                        value = agent.v1.RevokeTenantTokenResponse::ok
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RotateTenantTokenRequest(
    val tokenId: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.RotateTenantTokenRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.RotateTenantTokenRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.RotateTenantTokenRequest> {
        public val defaultInstance: agent.v1.RotateTenantTokenRequest by lazy { agent.v1.RotateTenantTokenRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.RotateTenantTokenRequest = agent.v1.RotateTenantTokenRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.RotateTenantTokenRequest> = pbandk.MessageDescriptor(
            fullName = "agent.v1.RotateTenantTokenRequest",
            messageClass = agent.v1.RotateTenantTokenRequest::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tokenId",
                        value = agent.v1.RotateTenantTokenRequest::tokenId
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class RotateTenantTokenResponse(
    val token: agent.v1.TenantToken? = null,
    val plaintext: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): agent.v1.RotateTenantTokenResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<agent.v1.RotateTenantTokenResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<agent.v1.RotateTenantTokenResponse> {
        public val defaultInstance: agent.v1.RotateTenantTokenResponse by lazy { agent.v1.RotateTenantTokenResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): agent.v1.RotateTenantTokenResponse = agent.v1.RotateTenantTokenResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<agent.v1.RotateTenantTokenResponse> = pbandk.MessageDescriptor(
            fullName = "agent.v1.RotateTenantTokenResponse",
            messageClass = agent.v1.RotateTenantTokenResponse::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = agent.v1.TenantToken.Companion),
                        jsonName = "token",
                        value = agent.v1.RotateTenantTokenResponse::token
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "plaintext",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "plaintext",
                        value = agent.v1.RotateTenantTokenResponse::plaintext
                    )
                )
            }
        )
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForSession")
public fun Session?.orDefault(): agent.v1.Session = this ?: Session.defaultInstance

private fun Session.protoMergeImpl(plus: pbandk.Message?): Session = (plus as? Session)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Session.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Session {
    var name = ""
    var model = ""
    var preset = ""
    var tipId = ""
    var maxTurns = 0
    var systemPrompt = ""
    var inputTokens = 0
    var outputTokens = 0
    var totalTokens = 0
    var lastInputTokens = 0
    var lastOutputTokens = 0
    var createdAt = ""
    var updatedAt = ""
    var lastUsedAt = ""
    var locale = ""
    var org = ""
    var repo = ""
    var branch = ""
    var unreadCount = 0
    var lastMessageAt = ""
    var lastMessagePreview = ""
    var variant = ""
    var messageSeq = 0
    var group = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> model = _fieldValue as String
            3 -> preset = _fieldValue as String
            4 -> tipId = _fieldValue as String
            5 -> maxTurns = _fieldValue as Int
            6 -> systemPrompt = _fieldValue as String
            7 -> inputTokens = _fieldValue as Int
            8 -> outputTokens = _fieldValue as Int
            9 -> totalTokens = _fieldValue as Int
            10 -> lastInputTokens = _fieldValue as Int
            11 -> lastOutputTokens = _fieldValue as Int
            12 -> createdAt = _fieldValue as String
            13 -> updatedAt = _fieldValue as String
            14 -> lastUsedAt = _fieldValue as String
            15 -> locale = _fieldValue as String
            16 -> org = _fieldValue as String
            17 -> repo = _fieldValue as String
            18 -> branch = _fieldValue as String
            19 -> unreadCount = _fieldValue as Int
            20 -> lastMessageAt = _fieldValue as String
            21 -> lastMessagePreview = _fieldValue as String
            22 -> variant = _fieldValue as String
            23 -> messageSeq = _fieldValue as Int
            24 -> group = _fieldValue as String
        }
    }

    return Session(name, model, preset, tipId,
        maxTurns, systemPrompt, inputTokens, outputTokens,
        totalTokens, lastInputTokens, lastOutputTokens, createdAt,
        updatedAt, lastUsedAt, locale, org,
        repo, branch, unreadCount, lastMessageAt,
        lastMessagePreview, variant, messageSeq, group, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessage")
public fun Message?.orDefault(): agent.v1.Message = this ?: Message.defaultInstance

private fun Message.protoMergeImpl(plus: pbandk.Message?): Message = (plus as? Message)?.let {
    it.copy(
        parts = parts + plus.parts,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Message.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Message {
    var id = ""
    var role = ""
    var prevId = ""
    var createdAt = ""
    var parts: pbandk.ListWithSize.Builder<agent.v1.Part>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> role = _fieldValue as String
            3 -> prevId = _fieldValue as String
            4 -> createdAt = _fieldValue as String
            5 -> parts = (parts ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.Part> }
        }
    }

    return Message(id, role, prevId, createdAt,
        pbandk.ListWithSize.Builder.fixed(parts), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPart")
public fun Part?.orDefault(): agent.v1.Part = this ?: Part.defaultInstance

private fun Part.protoMergeImpl(plus: pbandk.Message?): Part = (plus as? Part)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Part.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Part {
    var id = ""
    var messageId = ""
    var type = ""
    var seq = 0
    var data = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> messageId = _fieldValue as String
            3 -> type = _fieldValue as String
            4 -> seq = _fieldValue as Int
            5 -> data = _fieldValue as String
        }
    }

    return Part(id, messageId, type, seq,
        data, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMailboxEntry")
public fun MailboxEntry?.orDefault(): agent.v1.MailboxEntry = this ?: MailboxEntry.defaultInstance

private fun MailboxEntry.protoMergeImpl(plus: pbandk.Message?): MailboxEntry = (plus as? MailboxEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MailboxEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MailboxEntry {
    var id = ""
    var sessionName = ""
    var msgType = ""
    var payload = ""
    var effectiveAt = ""
    var status = ""
    var createdAt = ""
    var consumedAt = ""
    var seq = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> sessionName = _fieldValue as String
            3 -> msgType = _fieldValue as String
            4 -> payload = _fieldValue as String
            5 -> effectiveAt = _fieldValue as String
            6 -> status = _fieldValue as String
            7 -> createdAt = _fieldValue as String
            8 -> consumedAt = _fieldValue as String
            9 -> seq = _fieldValue as Long
        }
    }

    return MailboxEntry(id, sessionName, msgType, payload,
        effectiveAt, status, createdAt, consumedAt,
        seq, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPreset")
public fun Preset?.orDefault(): agent.v1.Preset = this ?: Preset.defaultInstance

private fun Preset.protoMergeImpl(plus: pbandk.Message?): Preset = (plus as? Preset)?.let {
    it.copy(
        tools = tools + plus.tools,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Preset.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Preset {
    var id = ""
    var systemPrompt = ""
    var systemPromptI18n = ""
    var tools: pbandk.ListWithSize.Builder<String>? = null
    var maxTurns = 0
    var isSystem = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> systemPrompt = _fieldValue as String
            3 -> systemPromptI18n = _fieldValue as String
            4 -> tools = (tools ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            5 -> maxTurns = _fieldValue as Int
            6 -> isSystem = _fieldValue as Boolean
        }
    }

    return Preset(id, systemPrompt, systemPromptI18n, pbandk.ListWithSize.Builder.fixed(tools),
        maxTurns, isSystem, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForProvider")
public fun Provider?.orDefault(): agent.v1.Provider = this ?: Provider.defaultInstance

private fun Provider.protoMergeImpl(plus: pbandk.Message?): Provider = (plus as? Provider)?.let {
    it.copy(
        headers = headers + plus.headers,
        models = models + plus.models,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Provider.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Provider {
    var providerId = ""
    var apiType = ""
    var baseUrl = ""
    var apiKey = ""
    var headers: pbandk.MessageMap.Builder<String, String>? = null
    var models: pbandk.ListWithSize.Builder<agent.v1.ProviderModel>? = null
    var updatedAt = ""
    var capability = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> providerId = _fieldValue as String
            2 -> apiType = _fieldValue as String
            3 -> baseUrl = _fieldValue as String
            4 -> apiKey = _fieldValue as String
            5 -> headers = (headers ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as kotlin.sequences.Sequence<pbandk.MessageMap.Entry<String, String>> }
            6 -> models = (models ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.ProviderModel> }
            7 -> updatedAt = _fieldValue as String
            8 -> capability = _fieldValue as String
        }
    }

    return Provider(providerId, apiType, baseUrl, apiKey,
        pbandk.MessageMap.Builder.fixed(headers), pbandk.ListWithSize.Builder.fixed(models), updatedAt, capability, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForProviderHeadersEntry")
public fun Provider.HeadersEntry?.orDefault(): agent.v1.Provider.HeadersEntry = this ?: Provider.HeadersEntry.defaultInstance

private fun Provider.HeadersEntry.protoMergeImpl(plus: pbandk.Message?): Provider.HeadersEntry = (plus as? Provider.HeadersEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Provider.HeadersEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Provider.HeadersEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }

    return Provider.HeadersEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForProviderModel")
public fun ProviderModel?.orDefault(): agent.v1.ProviderModel = this ?: ProviderModel.defaultInstance

private fun ProviderModel.protoMergeImpl(plus: pbandk.Message?): ProviderModel = (plus as? ProviderModel)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ProviderModel.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ProviderModel {
    var id = ""
    var name = ""
    var contextLimit = 0L
    var modelType = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> contextLimit = _fieldValue as Long
            4 -> modelType = _fieldValue as String
        }
    }

    return ProviderModel(id, name, contextLimit, modelType, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForToolInfo")
public fun ToolInfo?.orDefault(): agent.v1.ToolInfo = this ?: ToolInfo.defaultInstance

private fun ToolInfo.protoMergeImpl(plus: pbandk.Message?): ToolInfo = (plus as? ToolInfo)?.let {
    it.copy(
        parameters = parameters?.plus(plus.parameters) ?: plus.parameters,
        configFields = configFields + plus.configFields,
        requiredConfig = requiredConfig + plus.requiredConfig,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ToolInfo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ToolInfo {
    var name = ""
    var description = ""
    var category = ""
    var parameters: pbandk.wkt.Struct? = null
    var configFields: pbandk.ListWithSize.Builder<agent.v1.ToolConfigField>? = null
    var requiredConfig: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> description = _fieldValue as String
            3 -> category = _fieldValue as String
            4 -> parameters = _fieldValue as pbandk.wkt.Struct
            5 -> configFields = (configFields ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.ToolConfigField> }
            6 -> requiredConfig = (requiredConfig ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return ToolInfo(name, description, category, parameters,
        pbandk.ListWithSize.Builder.fixed(configFields), pbandk.ListWithSize.Builder.fixed(requiredConfig), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForToolConfigField")
public fun ToolConfigField?.orDefault(): agent.v1.ToolConfigField = this ?: ToolConfigField.defaultInstance

private fun ToolConfigField.protoMergeImpl(plus: pbandk.Message?): ToolConfigField = (plus as? ToolConfigField)?.let {
    it.copy(
        enumValues = enumValues + plus.enumValues,
        default = default?.plus(plus.default) ?: plus.default,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ToolConfigField.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ToolConfigField {
    var name = ""
    var type = ""
    var enumValues: pbandk.ListWithSize.Builder<String>? = null
    var default: pbandk.wkt.Value? = null
    var description = ""
    var scope = ""
    var kind = ""
    var capability = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> type = _fieldValue as String
            3 -> enumValues = (enumValues ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            6 -> default = _fieldValue as pbandk.wkt.Value
            7 -> description = _fieldValue as String
            8 -> scope = _fieldValue as String
            9 -> kind = _fieldValue as String
            10 -> capability = _fieldValue as String
        }
    }

    return ToolConfigField(name, type, pbandk.ListWithSize.Builder.fixed(enumValues), default,
        description, scope, kind, capability, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForToolConfig")
public fun ToolConfig?.orDefault(): agent.v1.ToolConfig = this ?: ToolConfig.defaultInstance

private fun ToolConfig.protoMergeImpl(plus: pbandk.Message?): ToolConfig = (plus as? ToolConfig)?.let {
    it.copy(
        values = values + plus.values,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ToolConfig.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ToolConfig {
    var values: pbandk.MessageMap.Builder<String, pbandk.wkt.Value?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> values = (values ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as kotlin.sequences.Sequence<pbandk.MessageMap.Entry<String, pbandk.wkt.Value?>> }
        }
    }

    return ToolConfig(pbandk.MessageMap.Builder.fixed(values), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForToolConfigValuesEntry")
public fun ToolConfig.ValuesEntry?.orDefault(): agent.v1.ToolConfig.ValuesEntry = this ?: ToolConfig.ValuesEntry.defaultInstance

private fun ToolConfig.ValuesEntry.protoMergeImpl(plus: pbandk.Message?): ToolConfig.ValuesEntry = (plus as? ToolConfig.ValuesEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ToolConfig.ValuesEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ToolConfig.ValuesEntry {
    var key = ""
    var value: pbandk.wkt.Value? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.wkt.Value
        }
    }

    return ToolConfig.ValuesEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPromptResponse")
public fun PromptResponse?.orDefault(): agent.v1.PromptResponse = this ?: PromptResponse.defaultInstance

private fun PromptResponse.protoMergeImpl(plus: pbandk.Message?): PromptResponse = (plus as? PromptResponse)?.let {
    it.copy(
        params = params + plus.params,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PromptResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PromptResponse {
    var event = ""
    var params: pbandk.MessageMap.Builder<String, String>? = null
    var eid = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> event = _fieldValue as String
            2 -> params = (params ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as kotlin.sequences.Sequence<pbandk.MessageMap.Entry<String, String>> }
            3 -> eid = _fieldValue as String
        }
    }

    return PromptResponse(event, pbandk.MessageMap.Builder.fixed(params), eid, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPromptResponseParamsEntry")
public fun PromptResponse.ParamsEntry?.orDefault(): agent.v1.PromptResponse.ParamsEntry = this ?: PromptResponse.ParamsEntry.defaultInstance

private fun PromptResponse.ParamsEntry.protoMergeImpl(plus: pbandk.Message?): PromptResponse.ParamsEntry = (plus as? PromptResponse.ParamsEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PromptResponse.ParamsEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PromptResponse.ParamsEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }

    return PromptResponse.ParamsEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForWatchSessionRequest")
public fun WatchSessionRequest?.orDefault(): agent.v1.WatchSessionRequest = this ?: WatchSessionRequest.defaultInstance

private fun WatchSessionRequest.protoMergeImpl(plus: pbandk.Message?): WatchSessionRequest = (plus as? WatchSessionRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun WatchSessionRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): WatchSessionRequest {
    var id = ""
    var since = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> since = _fieldValue as String
        }
    }

    return WatchSessionRequest(id, since, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForWatchSessionResponse")
public fun WatchSessionResponse?.orDefault(): agent.v1.WatchSessionResponse = this ?: WatchSessionResponse.defaultInstance

private fun WatchSessionResponse.protoMergeImpl(plus: pbandk.Message?): WatchSessionResponse = (plus as? WatchSessionResponse)?.let {
    it.copy(
        params = params?.plus(plus.params) ?: plus.params,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun WatchSessionResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): WatchSessionResponse {
    var event = ""
    var params: pbandk.wkt.Struct? = null
    var eid = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> event = _fieldValue as String
            2 -> params = _fieldValue as pbandk.wkt.Struct
            3 -> eid = _fieldValue as String
        }
    }

    return WatchSessionResponse(event, params, eid, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForWatchSessionsRequest")
public fun WatchSessionsRequest?.orDefault(): agent.v1.WatchSessionsRequest = this ?: WatchSessionsRequest.defaultInstance

private fun WatchSessionsRequest.protoMergeImpl(plus: pbandk.Message?): WatchSessionsRequest = (plus as? WatchSessionsRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun WatchSessionsRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): WatchSessionsRequest {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return WatchSessionsRequest(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForWatchSessionsResponse")
public fun WatchSessionsResponse?.orDefault(): agent.v1.WatchSessionsResponse = this ?: WatchSessionsResponse.defaultInstance

private fun WatchSessionsResponse.protoMergeImpl(plus: pbandk.Message?): WatchSessionsResponse = (plus as? WatchSessionsResponse)?.let {
    it.copy(
        upserts = upserts + plus.upserts,
        removed = removed + plus.removed,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun WatchSessionsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): WatchSessionsResponse {
    var upserts: pbandk.ListWithSize.Builder<agent.v1.Session>? = null
    var removed: pbandk.ListWithSize.Builder<String>? = null
    var snapshot = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> upserts = (upserts ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.Session> }
            2 -> removed = (removed ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            3 -> snapshot = _fieldValue as Boolean
        }
    }

    return WatchSessionsResponse(pbandk.ListWithSize.Builder.fixed(upserts), pbandk.ListWithSize.Builder.fixed(removed), snapshot, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFileRef")
public fun FileRef?.orDefault(): agent.v1.FileRef = this ?: FileRef.defaultInstance

private fun FileRef.protoMergeImpl(plus: pbandk.Message?): FileRef = (plus as? FileRef)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FileRef.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileRef {
    var code = ""
    var name = ""
    var size = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> code = _fieldValue as String
            2 -> name = _fieldValue as String
            4 -> size = _fieldValue as Int
        }
    }

    return FileRef(code, name, size, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListSessionsRequest")
public fun ListSessionsRequest?.orDefault(): agent.v1.ListSessionsRequest = this ?: ListSessionsRequest.defaultInstance

private fun ListSessionsRequest.protoMergeImpl(plus: pbandk.Message?): ListSessionsRequest = (plus as? ListSessionsRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListSessionsRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListSessionsRequest {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return ListSessionsRequest(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListSessionsResponse")
public fun ListSessionsResponse?.orDefault(): agent.v1.ListSessionsResponse = this ?: ListSessionsResponse.defaultInstance

private fun ListSessionsResponse.protoMergeImpl(plus: pbandk.Message?): ListSessionsResponse = (plus as? ListSessionsResponse)?.let {
    it.copy(
        sessions = sessions + plus.sessions,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListSessionsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListSessionsResponse {
    var sessions: pbandk.ListWithSize.Builder<agent.v1.Session>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sessions = (sessions ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.Session> }
        }
    }

    return ListSessionsResponse(pbandk.ListWithSize.Builder.fixed(sessions), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCreateSessionRequest")
public fun CreateSessionRequest?.orDefault(): agent.v1.CreateSessionRequest = this ?: CreateSessionRequest.defaultInstance

private fun CreateSessionRequest.protoMergeImpl(plus: pbandk.Message?): CreateSessionRequest = (plus as? CreateSessionRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CreateSessionRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CreateSessionRequest {
    var name = ""
    var model = ""
    var preset = ""
    var org = ""
    var repo = ""
    var branch = ""
    var variant = ""
    var group = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> model = _fieldValue as String
            3 -> preset = _fieldValue as String
            4 -> org = _fieldValue as String
            5 -> repo = _fieldValue as String
            6 -> branch = _fieldValue as String
            7 -> variant = _fieldValue as String
            8 -> group = _fieldValue as String
        }
    }

    return CreateSessionRequest(name, model, preset, org,
        repo, branch, variant, group, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCreateSessionResponse")
public fun CreateSessionResponse?.orDefault(): agent.v1.CreateSessionResponse = this ?: CreateSessionResponse.defaultInstance

private fun CreateSessionResponse.protoMergeImpl(plus: pbandk.Message?): CreateSessionResponse = (plus as? CreateSessionResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CreateSessionResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CreateSessionResponse {
    var ok = false
    var sessionName = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
            2 -> sessionName = _fieldValue as String
        }
    }

    return CreateSessionResponse(ok, sessionName, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetSessionRequest")
public fun GetSessionRequest?.orDefault(): agent.v1.GetSessionRequest = this ?: GetSessionRequest.defaultInstance

private fun GetSessionRequest.protoMergeImpl(plus: pbandk.Message?): GetSessionRequest = (plus as? GetSessionRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetSessionRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetSessionRequest {
    var id = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
        }
    }

    return GetSessionRequest(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetSessionResponse")
public fun GetSessionResponse?.orDefault(): agent.v1.GetSessionResponse = this ?: GetSessionResponse.defaultInstance

private fun GetSessionResponse.protoMergeImpl(plus: pbandk.Message?): GetSessionResponse = (plus as? GetSessionResponse)?.let {
    it.copy(
        session = session?.plus(plus.session) ?: plus.session,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetSessionResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetSessionResponse {
    var session: agent.v1.Session? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> session = _fieldValue as agent.v1.Session
        }
    }

    return GetSessionResponse(session, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDeleteSessionRequest")
public fun DeleteSessionRequest?.orDefault(): agent.v1.DeleteSessionRequest = this ?: DeleteSessionRequest.defaultInstance

private fun DeleteSessionRequest.protoMergeImpl(plus: pbandk.Message?): DeleteSessionRequest = (plus as? DeleteSessionRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DeleteSessionRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DeleteSessionRequest {
    var id = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
        }
    }

    return DeleteSessionRequest(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDeleteSessionResponse")
public fun DeleteSessionResponse?.orDefault(): agent.v1.DeleteSessionResponse = this ?: DeleteSessionResponse.defaultInstance

private fun DeleteSessionResponse.protoMergeImpl(plus: pbandk.Message?): DeleteSessionResponse = (plus as? DeleteSessionResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DeleteSessionResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DeleteSessionResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return DeleteSessionResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListMessagesRequest")
public fun ListMessagesRequest?.orDefault(): agent.v1.ListMessagesRequest = this ?: ListMessagesRequest.defaultInstance

private fun ListMessagesRequest.protoMergeImpl(plus: pbandk.Message?): ListMessagesRequest = (plus as? ListMessagesRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListMessagesRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListMessagesRequest {
    var id = ""
    var limit = 0
    var before = ""
    var after = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> limit = _fieldValue as Int
            3 -> before = _fieldValue as String
            4 -> after = _fieldValue as String
        }
    }

    return ListMessagesRequest(id, limit, before, after, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListMessagesResponse")
public fun ListMessagesResponse?.orDefault(): agent.v1.ListMessagesResponse = this ?: ListMessagesResponse.defaultInstance

private fun ListMessagesResponse.protoMergeImpl(plus: pbandk.Message?): ListMessagesResponse = (plus as? ListMessagesResponse)?.let {
    it.copy(
        messages = messages + plus.messages,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListMessagesResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListMessagesResponse {
    var ok = false
    var messages: pbandk.ListWithSize.Builder<agent.v1.Message>? = null
    var resync = false
    var tipId = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
            2 -> messages = (messages ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.Message> }
            3 -> resync = _fieldValue as Boolean
            4 -> tipId = _fieldValue as String
        }
    }

    return ListMessagesResponse(ok, pbandk.ListWithSize.Builder.fixed(messages), resync, tipId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPromptRequest")
public fun PromptRequest?.orDefault(): agent.v1.PromptRequest = this ?: PromptRequest.defaultInstance

private fun PromptRequest.protoMergeImpl(plus: pbandk.Message?): PromptRequest = (plus as? PromptRequest)?.let {
    it.copy(
        attachments = attachments + plus.attachments,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PromptRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PromptRequest {
    var id = ""
    var prompt = ""
    var attachments: pbandk.ListWithSize.Builder<agent.v1.FileRef>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> prompt = _fieldValue as String
            3 -> attachments = (attachments ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.FileRef> }
        }
    }

    return PromptRequest(id, prompt, pbandk.ListWithSize.Builder.fixed(attachments), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForForkRequest")
public fun ForkRequest?.orDefault(): agent.v1.ForkRequest = this ?: ForkRequest.defaultInstance

private fun ForkRequest.protoMergeImpl(plus: pbandk.Message?): ForkRequest = (plus as? ForkRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ForkRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ForkRequest {
    var id = ""
    var name = ""
    var messageId = ""
    var preset = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> messageId = _fieldValue as String
            4 -> preset = _fieldValue as String
        }
    }

    return ForkRequest(id, name, messageId, preset, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForForkResponse")
public fun ForkResponse?.orDefault(): agent.v1.ForkResponse = this ?: ForkResponse.defaultInstance

private fun ForkResponse.protoMergeImpl(plus: pbandk.Message?): ForkResponse = (plus as? ForkResponse)?.let {
    it.copy(
        session = session?.plus(plus.session) ?: plus.session,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ForkResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ForkResponse {
    var session: agent.v1.Session? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> session = _fieldValue as agent.v1.Session
        }
    }

    return ForkResponse(session, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRenameRequest")
public fun RenameRequest?.orDefault(): agent.v1.RenameRequest = this ?: RenameRequest.defaultInstance

private fun RenameRequest.protoMergeImpl(plus: pbandk.Message?): RenameRequest = (plus as? RenameRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RenameRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RenameRequest {
    var id = ""
    var name = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
        }
    }

    return RenameRequest(id, name, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRenameResponse")
public fun RenameResponse?.orDefault(): agent.v1.RenameResponse = this ?: RenameResponse.defaultInstance

private fun RenameResponse.protoMergeImpl(plus: pbandk.Message?): RenameResponse = (plus as? RenameResponse)?.let {
    it.copy(
        session = session?.plus(plus.session) ?: plus.session,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RenameResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RenameResponse {
    var session: agent.v1.Session? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> session = _fieldValue as agent.v1.Session
        }
    }

    return RenameResponse(session, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSetModelRequest")
public fun SetModelRequest?.orDefault(): agent.v1.SetModelRequest = this ?: SetModelRequest.defaultInstance

private fun SetModelRequest.protoMergeImpl(plus: pbandk.Message?): SetModelRequest = (plus as? SetModelRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SetModelRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SetModelRequest {
    var id = ""
    var model = ""
    var variant = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> model = _fieldValue as String
            3 -> variant = _fieldValue as String
        }
    }

    return SetModelRequest(id, model, variant, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSetModelResponse")
public fun SetModelResponse?.orDefault(): agent.v1.SetModelResponse = this ?: SetModelResponse.defaultInstance

private fun SetModelResponse.protoMergeImpl(plus: pbandk.Message?): SetModelResponse = (plus as? SetModelResponse)?.let {
    it.copy(
        session = session?.plus(plus.session) ?: plus.session,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SetModelResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SetModelResponse {
    var session: agent.v1.Session? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> session = _fieldValue as agent.v1.Session
        }
    }

    return SetModelResponse(session, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUndoRequest")
public fun UndoRequest?.orDefault(): agent.v1.UndoRequest = this ?: UndoRequest.defaultInstance

private fun UndoRequest.protoMergeImpl(plus: pbandk.Message?): UndoRequest = (plus as? UndoRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UndoRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UndoRequest {
    var id = ""
    var messageId = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> messageId = _fieldValue as String
        }
    }

    return UndoRequest(id, messageId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUndoResponse")
public fun UndoResponse?.orDefault(): agent.v1.UndoResponse = this ?: UndoResponse.defaultInstance

private fun UndoResponse.protoMergeImpl(plus: pbandk.Message?): UndoResponse = (plus as? UndoResponse)?.let {
    it.copy(
        session = session?.plus(plus.session) ?: plus.session,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UndoResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UndoResponse {
    var session: agent.v1.Session? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> session = _fieldValue as agent.v1.Session
        }
    }

    return UndoResponse(session, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForStateRequest")
public fun StateRequest?.orDefault(): agent.v1.StateRequest = this ?: StateRequest.defaultInstance

private fun StateRequest.protoMergeImpl(plus: pbandk.Message?): StateRequest = (plus as? StateRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun StateRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): StateRequest {
    var id = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
        }
    }

    return StateRequest(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForStateResponse")
public fun StateResponse?.orDefault(): agent.v1.StateResponse = this ?: StateResponse.defaultInstance

private fun StateResponse.protoMergeImpl(plus: pbandk.Message?): StateResponse = (plus as? StateResponse)?.let {
    it.copy(
        state = state?.plus(plus.state) ?: plus.state,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun StateResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): StateResponse {
    var state: pbandk.wkt.Struct? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> state = _fieldValue as pbandk.wkt.Struct
        }
    }

    return StateResponse(state, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMailboxRequest")
public fun MailboxRequest?.orDefault(): agent.v1.MailboxRequest = this ?: MailboxRequest.defaultInstance

private fun MailboxRequest.protoMergeImpl(plus: pbandk.Message?): MailboxRequest = (plus as? MailboxRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MailboxRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MailboxRequest {
    var id = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
        }
    }

    return MailboxRequest(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMailboxResponse")
public fun MailboxResponse?.orDefault(): agent.v1.MailboxResponse = this ?: MailboxResponse.defaultInstance

private fun MailboxResponse.protoMergeImpl(plus: pbandk.Message?): MailboxResponse = (plus as? MailboxResponse)?.let {
    it.copy(
        mailbox = mailbox + plus.mailbox,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MailboxResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MailboxResponse {
    var ok = false
    var mailbox: pbandk.ListWithSize.Builder<agent.v1.MailboxEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
            2 -> mailbox = (mailbox ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.MailboxEntry> }
        }
    }

    return MailboxResponse(ok, pbandk.ListWithSize.Builder.fixed(mailbox), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUpdateSettingsRequest")
public fun UpdateSettingsRequest?.orDefault(): agent.v1.UpdateSettingsRequest = this ?: UpdateSettingsRequest.defaultInstance

private fun UpdateSettingsRequest.protoMergeImpl(plus: pbandk.Message?): UpdateSettingsRequest = (plus as? UpdateSettingsRequest)?.let {
    it.copy(
        maxTurns = plus.maxTurns ?: maxTurns,
        group = plus.group ?: group,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UpdateSettingsRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UpdateSettingsRequest {
    var id = ""
    var model = ""
    var preset = ""
    var systemPrompt = ""
    var locale = ""
    var variant = ""
    var maxTurns: Int? = null
    var group: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> model = _fieldValue as String
            3 -> preset = _fieldValue as String
            4 -> maxTurns = _fieldValue as Int
            5 -> systemPrompt = _fieldValue as String
            6 -> locale = _fieldValue as String
            7 -> variant = _fieldValue as String
            8 -> group = _fieldValue as String
        }
    }

    return UpdateSettingsRequest(id, model, preset, systemPrompt,
        locale, variant, maxTurns, group, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUpdateSettingsResponse")
public fun UpdateSettingsResponse?.orDefault(): agent.v1.UpdateSettingsResponse = this ?: UpdateSettingsResponse.defaultInstance

private fun UpdateSettingsResponse.protoMergeImpl(plus: pbandk.Message?): UpdateSettingsResponse = (plus as? UpdateSettingsResponse)?.let {
    it.copy(
        session = session?.plus(plus.session) ?: plus.session,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UpdateSettingsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UpdateSettingsResponse {
    var session: agent.v1.Session? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> session = _fieldValue as agent.v1.Session
        }
    }

    return UpdateSettingsResponse(session, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForInterruptRequest")
public fun InterruptRequest?.orDefault(): agent.v1.InterruptRequest = this ?: InterruptRequest.defaultInstance

private fun InterruptRequest.protoMergeImpl(plus: pbandk.Message?): InterruptRequest = (plus as? InterruptRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun InterruptRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): InterruptRequest {
    var id = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
        }
    }

    return InterruptRequest(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForInterruptResponse")
public fun InterruptResponse?.orDefault(): agent.v1.InterruptResponse = this ?: InterruptResponse.defaultInstance

private fun InterruptResponse.protoMergeImpl(plus: pbandk.Message?): InterruptResponse = (plus as? InterruptResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun InterruptResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): InterruptResponse {
    var ok = false
    var interrupted = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
            2 -> interrupted = _fieldValue as Boolean
        }
    }

    return InterruptResponse(ok, interrupted, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCompactRequest")
public fun CompactRequest?.orDefault(): agent.v1.CompactRequest = this ?: CompactRequest.defaultInstance

private fun CompactRequest.protoMergeImpl(plus: pbandk.Message?): CompactRequest = (plus as? CompactRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CompactRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CompactRequest {
    var id = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
        }
    }

    return CompactRequest(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCompactResponse")
public fun CompactResponse?.orDefault(): agent.v1.CompactResponse = this ?: CompactResponse.defaultInstance

private fun CompactResponse.protoMergeImpl(plus: pbandk.Message?): CompactResponse = (plus as? CompactResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CompactResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CompactResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return CompactResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListProvidersRequest")
public fun ListProvidersRequest?.orDefault(): agent.v1.ListProvidersRequest = this ?: ListProvidersRequest.defaultInstance

private fun ListProvidersRequest.protoMergeImpl(plus: pbandk.Message?): ListProvidersRequest = (plus as? ListProvidersRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListProvidersRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListProvidersRequest {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return ListProvidersRequest(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListProvidersResponse")
public fun ListProvidersResponse?.orDefault(): agent.v1.ListProvidersResponse = this ?: ListProvidersResponse.defaultInstance

private fun ListProvidersResponse.protoMergeImpl(plus: pbandk.Message?): ListProvidersResponse = (plus as? ListProvidersResponse)?.let {
    it.copy(
        providers = providers + plus.providers,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListProvidersResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListProvidersResponse {
    var providers: pbandk.ListWithSize.Builder<agent.v1.Provider>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> providers = (providers ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.Provider> }
        }
    }

    return ListProvidersResponse(pbandk.ListWithSize.Builder.fixed(providers), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListProvidersCatalogRequest")
public fun ListProvidersCatalogRequest?.orDefault(): agent.v1.ListProvidersCatalogRequest = this ?: ListProvidersCatalogRequest.defaultInstance

private fun ListProvidersCatalogRequest.protoMergeImpl(plus: pbandk.Message?): ListProvidersCatalogRequest = (plus as? ListProvidersCatalogRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListProvidersCatalogRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListProvidersCatalogRequest {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return ListProvidersCatalogRequest(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListProvidersCatalogResponse")
public fun ListProvidersCatalogResponse?.orDefault(): agent.v1.ListProvidersCatalogResponse = this ?: ListProvidersCatalogResponse.defaultInstance

private fun ListProvidersCatalogResponse.protoMergeImpl(plus: pbandk.Message?): ListProvidersCatalogResponse = (plus as? ListProvidersCatalogResponse)?.let {
    it.copy(
        apiTypes = apiTypes + plus.apiTypes,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListProvidersCatalogResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListProvidersCatalogResponse {
    var apiTypes: pbandk.MessageMap.Builder<String, agent.v1.ApiTypeCatalog?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> apiTypes = (apiTypes ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as kotlin.sequences.Sequence<pbandk.MessageMap.Entry<String, agent.v1.ApiTypeCatalog?>> }
        }
    }

    return ListProvidersCatalogResponse(pbandk.MessageMap.Builder.fixed(apiTypes), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListProvidersCatalogResponseApiTypesEntry")
public fun ListProvidersCatalogResponse.ApiTypesEntry?.orDefault(): agent.v1.ListProvidersCatalogResponse.ApiTypesEntry = this ?: ListProvidersCatalogResponse.ApiTypesEntry.defaultInstance

private fun ListProvidersCatalogResponse.ApiTypesEntry.protoMergeImpl(plus: pbandk.Message?): ListProvidersCatalogResponse.ApiTypesEntry = (plus as? ListProvidersCatalogResponse.ApiTypesEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListProvidersCatalogResponse.ApiTypesEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListProvidersCatalogResponse.ApiTypesEntry {
    var key = ""
    var value: agent.v1.ApiTypeCatalog? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as agent.v1.ApiTypeCatalog
        }
    }

    return ListProvidersCatalogResponse.ApiTypesEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForApiTypeCatalog")
public fun ApiTypeCatalog?.orDefault(): agent.v1.ApiTypeCatalog = this ?: ApiTypeCatalog.defaultInstance

private fun ApiTypeCatalog.protoMergeImpl(plus: pbandk.Message?): ApiTypeCatalog = (plus as? ApiTypeCatalog)?.let {
    it.copy(
        capabilities = capabilities + plus.capabilities,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ApiTypeCatalog.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ApiTypeCatalog {
    var capabilities: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> capabilities = (capabilities ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return ApiTypeCatalog(pbandk.ListWithSize.Builder.fixed(capabilities), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRegisterProviderRequest")
public fun RegisterProviderRequest?.orDefault(): agent.v1.RegisterProviderRequest = this ?: RegisterProviderRequest.defaultInstance

private fun RegisterProviderRequest.protoMergeImpl(plus: pbandk.Message?): RegisterProviderRequest = (plus as? RegisterProviderRequest)?.let {
    it.copy(
        provider = provider?.plus(plus.provider) ?: plus.provider,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RegisterProviderRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RegisterProviderRequest {
    var provider: agent.v1.Provider? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> provider = _fieldValue as agent.v1.Provider
        }
    }

    return RegisterProviderRequest(provider, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRegisterProviderResponse")
public fun RegisterProviderResponse?.orDefault(): agent.v1.RegisterProviderResponse = this ?: RegisterProviderResponse.defaultInstance

private fun RegisterProviderResponse.protoMergeImpl(plus: pbandk.Message?): RegisterProviderResponse = (plus as? RegisterProviderResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RegisterProviderResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RegisterProviderResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return RegisterProviderResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDeleteProviderRequest")
public fun DeleteProviderRequest?.orDefault(): agent.v1.DeleteProviderRequest = this ?: DeleteProviderRequest.defaultInstance

private fun DeleteProviderRequest.protoMergeImpl(plus: pbandk.Message?): DeleteProviderRequest = (plus as? DeleteProviderRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DeleteProviderRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DeleteProviderRequest {
    var providerId = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> providerId = _fieldValue as String
        }
    }

    return DeleteProviderRequest(providerId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDeleteProviderResponse")
public fun DeleteProviderResponse?.orDefault(): agent.v1.DeleteProviderResponse = this ?: DeleteProviderResponse.defaultInstance

private fun DeleteProviderResponse.protoMergeImpl(plus: pbandk.Message?): DeleteProviderResponse = (plus as? DeleteProviderResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DeleteProviderResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DeleteProviderResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return DeleteProviderResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestProviderRequest")
public fun TestProviderRequest?.orDefault(): agent.v1.TestProviderRequest = this ?: TestProviderRequest.defaultInstance

private fun TestProviderRequest.protoMergeImpl(plus: pbandk.Message?): TestProviderRequest = (plus as? TestProviderRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestProviderRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestProviderRequest {
    var providerId = ""
    var apiType = ""
    var baseUrl = ""
    var apiKey = ""
    var model = ""
    var variant = ""
    var capability = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> providerId = _fieldValue as String
            2 -> apiType = _fieldValue as String
            3 -> baseUrl = _fieldValue as String
            4 -> apiKey = _fieldValue as String
            5 -> model = _fieldValue as String
            6 -> variant = _fieldValue as String
            7 -> capability = _fieldValue as String
        }
    }

    return TestProviderRequest(providerId, apiType, baseUrl, apiKey,
        model, variant, capability, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestProviderResponse")
public fun TestProviderResponse?.orDefault(): agent.v1.TestProviderResponse = this ?: TestProviderResponse.defaultInstance

private fun TestProviderResponse.protoMergeImpl(plus: pbandk.Message?): TestProviderResponse = (plus as? TestProviderResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestProviderResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestProviderResponse {
    var ok = false
    var result = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
            2 -> result = _fieldValue as String
        }
    }

    return TestProviderResponse(ok, result, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListModelsRequest")
public fun ListModelsRequest?.orDefault(): agent.v1.ListModelsRequest = this ?: ListModelsRequest.defaultInstance

private fun ListModelsRequest.protoMergeImpl(plus: pbandk.Message?): ListModelsRequest = (plus as? ListModelsRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListModelsRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListModelsRequest {
    var providerId = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> providerId = _fieldValue as String
        }
    }

    return ListModelsRequest(providerId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListModelsResponse")
public fun ListModelsResponse?.orDefault(): agent.v1.ListModelsResponse = this ?: ListModelsResponse.defaultInstance

private fun ListModelsResponse.protoMergeImpl(plus: pbandk.Message?): ListModelsResponse = (plus as? ListModelsResponse)?.let {
    it.copy(
        models = models + plus.models,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListModelsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListModelsResponse {
    var models: pbandk.ListWithSize.Builder<agent.v1.ModelInfo>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> models = (models ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.ModelInfo> }
        }
    }

    return ListModelsResponse(pbandk.ListWithSize.Builder.fixed(models), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForModelInfo")
public fun ModelInfo?.orDefault(): agent.v1.ModelInfo = this ?: ModelInfo.defaultInstance

private fun ModelInfo.protoMergeImpl(plus: pbandk.Message?): ModelInfo = (plus as? ModelInfo)?.let {
    it.copy(
        variants = variants + plus.variants,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ModelInfo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ModelInfo {
    var id = ""
    var name = ""
    var variants: pbandk.ListWithSize.Builder<agent.v1.ModelVariant>? = null
    var contextLimit = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> variants = (variants ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.ModelVariant> }
            4 -> contextLimit = _fieldValue as Long
        }
    }

    return ModelInfo(id, name, pbandk.ListWithSize.Builder.fixed(variants), contextLimit, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForModelVariant")
public fun ModelVariant?.orDefault(): agent.v1.ModelVariant = this ?: ModelVariant.defaultInstance

private fun ModelVariant.protoMergeImpl(plus: pbandk.Message?): ModelVariant = (plus as? ModelVariant)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ModelVariant.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ModelVariant {
    var id = ""
    var name = ""
    var description = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> description = _fieldValue as String
        }
    }

    return ModelVariant(id, name, description, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListPresetsRequest")
public fun ListPresetsRequest?.orDefault(): agent.v1.ListPresetsRequest = this ?: ListPresetsRequest.defaultInstance

private fun ListPresetsRequest.protoMergeImpl(plus: pbandk.Message?): ListPresetsRequest = (plus as? ListPresetsRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListPresetsRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListPresetsRequest {
    var locale = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> locale = _fieldValue as String
        }
    }

    return ListPresetsRequest(locale, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListPresetsResponse")
public fun ListPresetsResponse?.orDefault(): agent.v1.ListPresetsResponse = this ?: ListPresetsResponse.defaultInstance

private fun ListPresetsResponse.protoMergeImpl(plus: pbandk.Message?): ListPresetsResponse = (plus as? ListPresetsResponse)?.let {
    it.copy(
        presets = presets + plus.presets,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListPresetsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListPresetsResponse {
    var presets: pbandk.ListWithSize.Builder<agent.v1.Preset>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> presets = (presets ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.Preset> }
        }
    }

    return ListPresetsResponse(pbandk.ListWithSize.Builder.fixed(presets), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUpsertPresetRequest")
public fun UpsertPresetRequest?.orDefault(): agent.v1.UpsertPresetRequest = this ?: UpsertPresetRequest.defaultInstance

private fun UpsertPresetRequest.protoMergeImpl(plus: pbandk.Message?): UpsertPresetRequest = (plus as? UpsertPresetRequest)?.let {
    it.copy(
        preset = preset?.plus(plus.preset) ?: plus.preset,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UpsertPresetRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UpsertPresetRequest {
    var preset: agent.v1.Preset? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> preset = _fieldValue as agent.v1.Preset
        }
    }

    return UpsertPresetRequest(preset, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUpsertPresetResponse")
public fun UpsertPresetResponse?.orDefault(): agent.v1.UpsertPresetResponse = this ?: UpsertPresetResponse.defaultInstance

private fun UpsertPresetResponse.protoMergeImpl(plus: pbandk.Message?): UpsertPresetResponse = (plus as? UpsertPresetResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UpsertPresetResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UpsertPresetResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return UpsertPresetResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDeletePresetRequest")
public fun DeletePresetRequest?.orDefault(): agent.v1.DeletePresetRequest = this ?: DeletePresetRequest.defaultInstance

private fun DeletePresetRequest.protoMergeImpl(plus: pbandk.Message?): DeletePresetRequest = (plus as? DeletePresetRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DeletePresetRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DeletePresetRequest {
    var id = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
        }
    }

    return DeletePresetRequest(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDeletePresetResponse")
public fun DeletePresetResponse?.orDefault(): agent.v1.DeletePresetResponse = this ?: DeletePresetResponse.defaultInstance

private fun DeletePresetResponse.protoMergeImpl(plus: pbandk.Message?): DeletePresetResponse = (plus as? DeletePresetResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DeletePresetResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DeletePresetResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return DeletePresetResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPreviewPresetRequest")
public fun PreviewPresetRequest?.orDefault(): agent.v1.PreviewPresetRequest = this ?: PreviewPresetRequest.defaultInstance

private fun PreviewPresetRequest.protoMergeImpl(plus: pbandk.Message?): PreviewPresetRequest = (plus as? PreviewPresetRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PreviewPresetRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PreviewPresetRequest {
    var id = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
        }
    }

    return PreviewPresetRequest(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPreviewPresetResponse")
public fun PreviewPresetResponse?.orDefault(): agent.v1.PreviewPresetResponse = this ?: PreviewPresetResponse.defaultInstance

private fun PreviewPresetResponse.protoMergeImpl(plus: pbandk.Message?): PreviewPresetResponse = (plus as? PreviewPresetResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PreviewPresetResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PreviewPresetResponse {
    var template = ""
    var rendered = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> template = _fieldValue as String
            2 -> rendered = _fieldValue as String
        }
    }

    return PreviewPresetResponse(template, rendered, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetConfigRequest")
public fun GetConfigRequest?.orDefault(): agent.v1.GetConfigRequest = this ?: GetConfigRequest.defaultInstance

private fun GetConfigRequest.protoMergeImpl(plus: pbandk.Message?): GetConfigRequest = (plus as? GetConfigRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetConfigRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetConfigRequest {
    var key = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
        }
    }

    return GetConfigRequest(key, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetConfigResponse")
public fun GetConfigResponse?.orDefault(): agent.v1.GetConfigResponse = this ?: GetConfigResponse.defaultInstance

private fun GetConfigResponse.protoMergeImpl(plus: pbandk.Message?): GetConfigResponse = (plus as? GetConfigResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetConfigResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetConfigResponse {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }

    return GetConfigResponse(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSetConfigRequest")
public fun SetConfigRequest?.orDefault(): agent.v1.SetConfigRequest = this ?: SetConfigRequest.defaultInstance

private fun SetConfigRequest.protoMergeImpl(plus: pbandk.Message?): SetConfigRequest = (plus as? SetConfigRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SetConfigRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SetConfigRequest {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }

    return SetConfigRequest(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSetConfigResponse")
public fun SetConfigResponse?.orDefault(): agent.v1.SetConfigResponse = this ?: SetConfigResponse.defaultInstance

private fun SetConfigResponse.protoMergeImpl(plus: pbandk.Message?): SetConfigResponse = (plus as? SetConfigResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SetConfigResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SetConfigResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return SetConfigResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListToolsRequest")
public fun ListToolsRequest?.orDefault(): agent.v1.ListToolsRequest = this ?: ListToolsRequest.defaultInstance

private fun ListToolsRequest.protoMergeImpl(plus: pbandk.Message?): ListToolsRequest = (plus as? ListToolsRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListToolsRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListToolsRequest {
    var locale = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> locale = _fieldValue as String
        }
    }

    return ListToolsRequest(locale, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListToolsResponse")
public fun ListToolsResponse?.orDefault(): agent.v1.ListToolsResponse = this ?: ListToolsResponse.defaultInstance

private fun ListToolsResponse.protoMergeImpl(plus: pbandk.Message?): ListToolsResponse = (plus as? ListToolsResponse)?.let {
    it.copy(
        tools = tools + plus.tools,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListToolsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListToolsResponse {
    var tools: pbandk.ListWithSize.Builder<agent.v1.ToolInfo>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tools = (tools ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.ToolInfo> }
        }
    }

    return ListToolsResponse(pbandk.ListWithSize.Builder.fixed(tools), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetToolConfigRequest")
public fun GetToolConfigRequest?.orDefault(): agent.v1.GetToolConfigRequest = this ?: GetToolConfigRequest.defaultInstance

private fun GetToolConfigRequest.protoMergeImpl(plus: pbandk.Message?): GetToolConfigRequest = (plus as? GetToolConfigRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetToolConfigRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetToolConfigRequest {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return GetToolConfigRequest(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetToolConfigResponse")
public fun GetToolConfigResponse?.orDefault(): agent.v1.GetToolConfigResponse = this ?: GetToolConfigResponse.defaultInstance

private fun GetToolConfigResponse.protoMergeImpl(plus: pbandk.Message?): GetToolConfigResponse = (plus as? GetToolConfigResponse)?.let {
    it.copy(
        config = config?.plus(plus.config) ?: plus.config,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetToolConfigResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetToolConfigResponse {
    var config: agent.v1.ToolConfig? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> config = _fieldValue as agent.v1.ToolConfig
        }
    }

    return GetToolConfigResponse(config, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSetToolConfigRequest")
public fun SetToolConfigRequest?.orDefault(): agent.v1.SetToolConfigRequest = this ?: SetToolConfigRequest.defaultInstance

private fun SetToolConfigRequest.protoMergeImpl(plus: pbandk.Message?): SetToolConfigRequest = (plus as? SetToolConfigRequest)?.let {
    it.copy(
        config = config?.plus(plus.config) ?: plus.config,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SetToolConfigRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SetToolConfigRequest {
    var config: pbandk.wkt.Struct? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> config = _fieldValue as pbandk.wkt.Struct
        }
    }

    return SetToolConfigRequest(config, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSetToolConfigResponse")
public fun SetToolConfigResponse?.orDefault(): agent.v1.SetToolConfigResponse = this ?: SetToolConfigResponse.defaultInstance

private fun SetToolConfigResponse.protoMergeImpl(plus: pbandk.Message?): SetToolConfigResponse = (plus as? SetToolConfigResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SetToolConfigResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SetToolConfigResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return SetToolConfigResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSetExtensionConfigRequest")
public fun SetExtensionConfigRequest?.orDefault(): agent.v1.SetExtensionConfigRequest = this ?: SetExtensionConfigRequest.defaultInstance

private fun SetExtensionConfigRequest.protoMergeImpl(plus: pbandk.Message?): SetExtensionConfigRequest = (plus as? SetExtensionConfigRequest)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SetExtensionConfigRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SetExtensionConfigRequest {
    var extId = ""
    var name = ""
    var value: pbandk.wkt.Value? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> extId = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> value = _fieldValue as pbandk.wkt.Value
        }
    }

    return SetExtensionConfigRequest(extId, name, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSetExtensionConfigResponse")
public fun SetExtensionConfigResponse?.orDefault(): agent.v1.SetExtensionConfigResponse = this ?: SetExtensionConfigResponse.defaultInstance

private fun SetExtensionConfigResponse.protoMergeImpl(plus: pbandk.Message?): SetExtensionConfigResponse = (plus as? SetExtensionConfigResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SetExtensionConfigResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SetExtensionConfigResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return SetExtensionConfigResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUploadFileRequest")
public fun UploadFileRequest?.orDefault(): agent.v1.UploadFileRequest = this ?: UploadFileRequest.defaultInstance

private fun UploadFileRequest.protoMergeImpl(plus: pbandk.Message?): UploadFileRequest = (plus as? UploadFileRequest)?.let {
    it.copy(
        file = file?.plus(plus.file) ?: plus.file,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UploadFileRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UploadFileRequest {
    var file: agent.v1.FileRef? = null
    var data = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> file = _fieldValue as agent.v1.FileRef
            2 -> data = _fieldValue as String
        }
    }

    return UploadFileRequest(file, data, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUploadFileResponse")
public fun UploadFileResponse?.orDefault(): agent.v1.UploadFileResponse = this ?: UploadFileResponse.defaultInstance

private fun UploadFileResponse.protoMergeImpl(plus: pbandk.Message?): UploadFileResponse = (plus as? UploadFileResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UploadFileResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UploadFileResponse {
    var ok = false
    var code = ""
    var mime = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
            2 -> code = _fieldValue as String
            3 -> mime = _fieldValue as String
        }
    }

    return UploadFileResponse(ok, code, mime, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForIngestFileRequest")
public fun IngestFileRequest?.orDefault(): agent.v1.IngestFileRequest = this ?: IngestFileRequest.defaultInstance

private fun IngestFileRequest.protoMergeImpl(plus: pbandk.Message?): IngestFileRequest = (plus as? IngestFileRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun IngestFileRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): IngestFileRequest {
    var code = ""
    var data: pbandk.ByteArr = pbandk.ByteArr.empty
    var name = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> code = _fieldValue as String
            2 -> data = _fieldValue as pbandk.ByteArr
            3 -> name = _fieldValue as String
        }
    }

    return IngestFileRequest(code, data, name, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForIngestFileResponse")
public fun IngestFileResponse?.orDefault(): agent.v1.IngestFileResponse = this ?: IngestFileResponse.defaultInstance

private fun IngestFileResponse.protoMergeImpl(plus: pbandk.Message?): IngestFileResponse = (plus as? IngestFileResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun IngestFileResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): IngestFileResponse {
    var ok = false
    var code = ""
    var mime = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
            2 -> code = _fieldValue as String
            3 -> mime = _fieldValue as String
        }
    }

    return IngestFileResponse(ok, code, mime, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetFileRequest")
public fun GetFileRequest?.orDefault(): agent.v1.GetFileRequest = this ?: GetFileRequest.defaultInstance

private fun GetFileRequest.protoMergeImpl(plus: pbandk.Message?): GetFileRequest = (plus as? GetFileRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetFileRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetFileRequest {
    var code = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> code = _fieldValue as String
        }
    }

    return GetFileRequest(code, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetFileResponse")
public fun GetFileResponse?.orDefault(): agent.v1.GetFileResponse = this ?: GetFileResponse.defaultInstance

private fun GetFileResponse.protoMergeImpl(plus: pbandk.Message?): GetFileResponse = (plus as? GetFileResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetFileResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetFileResponse {
    var data: pbandk.ByteArr = pbandk.ByteArr.empty
    var name = ""
    var mime = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = _fieldValue as pbandk.ByteArr
            2 -> name = _fieldValue as String
            3 -> mime = _fieldValue as String
        }
    }

    return GetFileResponse(data, name, mime, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetFileMetaRequest")
public fun GetFileMetaRequest?.orDefault(): agent.v1.GetFileMetaRequest = this ?: GetFileMetaRequest.defaultInstance

private fun GetFileMetaRequest.protoMergeImpl(plus: pbandk.Message?): GetFileMetaRequest = (plus as? GetFileMetaRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetFileMetaRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetFileMetaRequest {
    var code = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> code = _fieldValue as String
        }
    }

    return GetFileMetaRequest(code, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetFileMetaResponse")
public fun GetFileMetaResponse?.orDefault(): agent.v1.GetFileMetaResponse = this ?: GetFileMetaResponse.defaultInstance

private fun GetFileMetaResponse.protoMergeImpl(plus: pbandk.Message?): GetFileMetaResponse = (plus as? GetFileMetaResponse)?.let {
    it.copy(
        width = plus.width ?: width,
        height = plus.height ?: height,
        durationMs = plus.durationMs ?: durationMs,
        thumbCode = plus.thumbCode ?: thumbCode,
        thumbhash = plus.thumbhash ?: thumbhash,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetFileMetaResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetFileMetaResponse {
    var name = ""
    var mime = ""
    var size = 0
    var width: Int? = null
    var height: Int? = null
    var durationMs: Long? = null
    var thumbCode: String? = null
    var thumbhash: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> mime = _fieldValue as String
            3 -> size = _fieldValue as Int
            4 -> width = _fieldValue as Int
            5 -> height = _fieldValue as Int
            6 -> durationMs = _fieldValue as Long
            7 -> thumbCode = _fieldValue as String
            8 -> thumbhash = _fieldValue as String
        }
    }

    return GetFileMetaResponse(name, mime, size, width,
        height, durationMs, thumbCode, thumbhash, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFileChunk")
public fun FileChunk?.orDefault(): agent.v1.FileChunk = this ?: FileChunk.defaultInstance

private fun FileChunk.protoMergeImpl(plus: pbandk.Message?): FileChunk = (plus as? FileChunk)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FileChunk.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileChunk {
    var data: pbandk.ByteArr = pbandk.ByteArr.empty
    var offset = 0L
    var total = 0L
    var last = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = _fieldValue as pbandk.ByteArr
            2 -> offset = _fieldValue as Long
            3 -> total = _fieldValue as Long
            4 -> last = _fieldValue as Boolean
        }
    }

    return FileChunk(data, offset, total, last, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetAgentConfigRequest")
public fun GetAgentConfigRequest?.orDefault(): agent.v1.GetAgentConfigRequest = this ?: GetAgentConfigRequest.defaultInstance

private fun GetAgentConfigRequest.protoMergeImpl(plus: pbandk.Message?): GetAgentConfigRequest = (plus as? GetAgentConfigRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetAgentConfigRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetAgentConfigRequest {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return GetAgentConfigRequest(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetAgentConfigResponse")
public fun GetAgentConfigResponse?.orDefault(): agent.v1.GetAgentConfigResponse = this ?: GetAgentConfigResponse.defaultInstance

private fun GetAgentConfigResponse.protoMergeImpl(plus: pbandk.Message?): GetAgentConfigResponse = (plus as? GetAgentConfigResponse)?.let {
    it.copy(
        config = config?.plus(plus.config) ?: plus.config,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetAgentConfigResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetAgentConfigResponse {
    var config: pbandk.wkt.Struct? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> config = _fieldValue as pbandk.wkt.Struct
        }
    }

    return GetAgentConfigResponse(config, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForHealthRequest")
public fun HealthRequest?.orDefault(): agent.v1.HealthRequest = this ?: HealthRequest.defaultInstance

private fun HealthRequest.protoMergeImpl(plus: pbandk.Message?): HealthRequest = (plus as? HealthRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun HealthRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): HealthRequest {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return HealthRequest(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForHealthResponse")
public fun HealthResponse?.orDefault(): agent.v1.HealthResponse = this ?: HealthResponse.defaultInstance

private fun HealthResponse.protoMergeImpl(plus: pbandk.Message?): HealthResponse = (plus as? HealthResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun HealthResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): HealthResponse {
    var ok = false
    var name = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
            2 -> name = _fieldValue as String
        }
    }

    return HealthResponse(ok, name, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTenant")
public fun Tenant?.orDefault(): agent.v1.Tenant = this ?: Tenant.defaultInstance

private fun Tenant.protoMergeImpl(plus: pbandk.Message?): Tenant = (plus as? Tenant)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Tenant.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Tenant {
    var id = ""
    var name = ""
    var disabled = false
    var createdAt = ""
    var updatedAt = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> disabled = _fieldValue as Boolean
            4 -> createdAt = _fieldValue as String
            5 -> updatedAt = _fieldValue as String
        }
    }

    return Tenant(id, name, disabled, createdAt,
        updatedAt, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTenantToken")
public fun TenantToken?.orDefault(): agent.v1.TenantToken = this ?: TenantToken.defaultInstance

private fun TenantToken.protoMergeImpl(plus: pbandk.Message?): TenantToken = (plus as? TenantToken)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TenantToken.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TenantToken {
    var tokenId = ""
    var tenantId = ""
    var label = ""
    var createdAt = ""
    var lastUsedAt = ""
    var revoked = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tokenId = _fieldValue as String
            2 -> tenantId = _fieldValue as String
            3 -> label = _fieldValue as String
            4 -> createdAt = _fieldValue as String
            5 -> lastUsedAt = _fieldValue as String
            6 -> revoked = _fieldValue as Boolean
        }
    }

    return TenantToken(tokenId, tenantId, label, createdAt,
        lastUsedAt, revoked, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListTenantsRequest")
public fun ListTenantsRequest?.orDefault(): agent.v1.ListTenantsRequest = this ?: ListTenantsRequest.defaultInstance

private fun ListTenantsRequest.protoMergeImpl(plus: pbandk.Message?): ListTenantsRequest = (plus as? ListTenantsRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListTenantsRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListTenantsRequest {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return ListTenantsRequest(unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListTenantsResponse")
public fun ListTenantsResponse?.orDefault(): agent.v1.ListTenantsResponse = this ?: ListTenantsResponse.defaultInstance

private fun ListTenantsResponse.protoMergeImpl(plus: pbandk.Message?): ListTenantsResponse = (plus as? ListTenantsResponse)?.let {
    it.copy(
        tenants = tenants + plus.tenants,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListTenantsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListTenantsResponse {
    var tenants: pbandk.ListWithSize.Builder<agent.v1.Tenant>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tenants = (tenants ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.Tenant> }
        }
    }

    return ListTenantsResponse(pbandk.ListWithSize.Builder.fixed(tenants), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCreateTenantRequest")
public fun CreateTenantRequest?.orDefault(): agent.v1.CreateTenantRequest = this ?: CreateTenantRequest.defaultInstance

private fun CreateTenantRequest.protoMergeImpl(plus: pbandk.Message?): CreateTenantRequest = (plus as? CreateTenantRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CreateTenantRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CreateTenantRequest {
    var id = ""
    var name = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
        }
    }

    return CreateTenantRequest(id, name, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCreateTenantResponse")
public fun CreateTenantResponse?.orDefault(): agent.v1.CreateTenantResponse = this ?: CreateTenantResponse.defaultInstance

private fun CreateTenantResponse.protoMergeImpl(plus: pbandk.Message?): CreateTenantResponse = (plus as? CreateTenantResponse)?.let {
    it.copy(
        tenant = tenant?.plus(plus.tenant) ?: plus.tenant,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CreateTenantResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CreateTenantResponse {
    var tenant: agent.v1.Tenant? = null
    var token = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tenant = _fieldValue as agent.v1.Tenant
            2 -> token = _fieldValue as String
        }
    }

    return CreateTenantResponse(tenant, token, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUpdateTenantRequest")
public fun UpdateTenantRequest?.orDefault(): agent.v1.UpdateTenantRequest = this ?: UpdateTenantRequest.defaultInstance

private fun UpdateTenantRequest.protoMergeImpl(plus: pbandk.Message?): UpdateTenantRequest = (plus as? UpdateTenantRequest)?.let {
    it.copy(
        name = plus.name ?: name,
        disabled = plus.disabled ?: disabled,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UpdateTenantRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UpdateTenantRequest {
    var id = ""
    var name: String? = null
    var disabled: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> disabled = _fieldValue as Boolean
        }
    }

    return UpdateTenantRequest(id, name, disabled, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUpdateTenantResponse")
public fun UpdateTenantResponse?.orDefault(): agent.v1.UpdateTenantResponse = this ?: UpdateTenantResponse.defaultInstance

private fun UpdateTenantResponse.protoMergeImpl(plus: pbandk.Message?): UpdateTenantResponse = (plus as? UpdateTenantResponse)?.let {
    it.copy(
        tenant = tenant?.plus(plus.tenant) ?: plus.tenant,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UpdateTenantResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UpdateTenantResponse {
    var tenant: agent.v1.Tenant? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tenant = _fieldValue as agent.v1.Tenant
        }
    }

    return UpdateTenantResponse(tenant, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDeleteTenantRequest")
public fun DeleteTenantRequest?.orDefault(): agent.v1.DeleteTenantRequest = this ?: DeleteTenantRequest.defaultInstance

private fun DeleteTenantRequest.protoMergeImpl(plus: pbandk.Message?): DeleteTenantRequest = (plus as? DeleteTenantRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DeleteTenantRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DeleteTenantRequest {
    var id = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
        }
    }

    return DeleteTenantRequest(id, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDeleteTenantResponse")
public fun DeleteTenantResponse?.orDefault(): agent.v1.DeleteTenantResponse = this ?: DeleteTenantResponse.defaultInstance

private fun DeleteTenantResponse.protoMergeImpl(plus: pbandk.Message?): DeleteTenantResponse = (plus as? DeleteTenantResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DeleteTenantResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DeleteTenantResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return DeleteTenantResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForIssueTenantTokenRequest")
public fun IssueTenantTokenRequest?.orDefault(): agent.v1.IssueTenantTokenRequest = this ?: IssueTenantTokenRequest.defaultInstance

private fun IssueTenantTokenRequest.protoMergeImpl(plus: pbandk.Message?): IssueTenantTokenRequest = (plus as? IssueTenantTokenRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun IssueTenantTokenRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): IssueTenantTokenRequest {
    var tenantId = ""
    var label = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tenantId = _fieldValue as String
            2 -> label = _fieldValue as String
        }
    }

    return IssueTenantTokenRequest(tenantId, label, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForIssueTenantTokenResponse")
public fun IssueTenantTokenResponse?.orDefault(): agent.v1.IssueTenantTokenResponse = this ?: IssueTenantTokenResponse.defaultInstance

private fun IssueTenantTokenResponse.protoMergeImpl(plus: pbandk.Message?): IssueTenantTokenResponse = (plus as? IssueTenantTokenResponse)?.let {
    it.copy(
        token = token?.plus(plus.token) ?: plus.token,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun IssueTenantTokenResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): IssueTenantTokenResponse {
    var token: agent.v1.TenantToken? = null
    var plaintext = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> token = _fieldValue as agent.v1.TenantToken
            2 -> plaintext = _fieldValue as String
        }
    }

    return IssueTenantTokenResponse(token, plaintext, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListTenantTokensRequest")
public fun ListTenantTokensRequest?.orDefault(): agent.v1.ListTenantTokensRequest = this ?: ListTenantTokensRequest.defaultInstance

private fun ListTenantTokensRequest.protoMergeImpl(plus: pbandk.Message?): ListTenantTokensRequest = (plus as? ListTenantTokensRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListTenantTokensRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListTenantTokensRequest {
    var tenantId = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tenantId = _fieldValue as String
        }
    }

    return ListTenantTokensRequest(tenantId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListTenantTokensResponse")
public fun ListTenantTokensResponse?.orDefault(): agent.v1.ListTenantTokensResponse = this ?: ListTenantTokensResponse.defaultInstance

private fun ListTenantTokensResponse.protoMergeImpl(plus: pbandk.Message?): ListTenantTokensResponse = (plus as? ListTenantTokensResponse)?.let {
    it.copy(
        tokens = tokens + plus.tokens,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListTenantTokensResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListTenantTokensResponse {
    var tokens: pbandk.ListWithSize.Builder<agent.v1.TenantToken>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tokens = (tokens ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<agent.v1.TenantToken> }
        }
    }

    return ListTenantTokensResponse(pbandk.ListWithSize.Builder.fixed(tokens), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRevokeTenantTokenRequest")
public fun RevokeTenantTokenRequest?.orDefault(): agent.v1.RevokeTenantTokenRequest = this ?: RevokeTenantTokenRequest.defaultInstance

private fun RevokeTenantTokenRequest.protoMergeImpl(plus: pbandk.Message?): RevokeTenantTokenRequest = (plus as? RevokeTenantTokenRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RevokeTenantTokenRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RevokeTenantTokenRequest {
    var tokenId = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tokenId = _fieldValue as String
        }
    }

    return RevokeTenantTokenRequest(tokenId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRevokeTenantTokenResponse")
public fun RevokeTenantTokenResponse?.orDefault(): agent.v1.RevokeTenantTokenResponse = this ?: RevokeTenantTokenResponse.defaultInstance

private fun RevokeTenantTokenResponse.protoMergeImpl(plus: pbandk.Message?): RevokeTenantTokenResponse = (plus as? RevokeTenantTokenResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RevokeTenantTokenResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RevokeTenantTokenResponse {
    var ok = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ok = _fieldValue as Boolean
        }
    }

    return RevokeTenantTokenResponse(ok, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRotateTenantTokenRequest")
public fun RotateTenantTokenRequest?.orDefault(): agent.v1.RotateTenantTokenRequest = this ?: RotateTenantTokenRequest.defaultInstance

private fun RotateTenantTokenRequest.protoMergeImpl(plus: pbandk.Message?): RotateTenantTokenRequest = (plus as? RotateTenantTokenRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RotateTenantTokenRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RotateTenantTokenRequest {
    var tokenId = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tokenId = _fieldValue as String
        }
    }

    return RotateTenantTokenRequest(tokenId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRotateTenantTokenResponse")
public fun RotateTenantTokenResponse?.orDefault(): agent.v1.RotateTenantTokenResponse = this ?: RotateTenantTokenResponse.defaultInstance

private fun RotateTenantTokenResponse.protoMergeImpl(plus: pbandk.Message?): RotateTenantTokenResponse = (plus as? RotateTenantTokenResponse)?.let {
    it.copy(
        token = token?.plus(plus.token) ?: plus.token,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RotateTenantTokenResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RotateTenantTokenResponse {
    var token: agent.v1.TenantToken? = null
    var plaintext = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> token = _fieldValue as agent.v1.TenantToken
            2 -> plaintext = _fieldValue as String
        }
    }

    return RotateTenantTokenResponse(token, plaintext, unknownFields)
}
