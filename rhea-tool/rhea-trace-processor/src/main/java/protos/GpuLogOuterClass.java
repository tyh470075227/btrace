// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/perfetto/trace/gpu/gpu_log.proto

package perfetto.protos;

public final class GpuLogOuterClass {
  private GpuLogOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GpuLogOrBuilder extends
      // @@protoc_insertion_point(interface_extends:perfetto.protos.GpuLog)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .perfetto.protos.GpuLog.Severity severity = 1;</code>
     * @return Whether the severity field is set.
     */
    boolean hasSeverity();
    /**
     * <code>optional .perfetto.protos.GpuLog.Severity severity = 1;</code>
     * @return The severity.
     */
    perfetto.protos.GpuLogOuterClass.GpuLog.Severity getSeverity();

    /**
     * <code>optional string tag = 2;</code>
     * @return Whether the tag field is set.
     */
    boolean hasTag();
    /**
     * <code>optional string tag = 2;</code>
     * @return The tag.
     */
    java.lang.String getTag();
    /**
     * <code>optional string tag = 2;</code>
     * @return The bytes for tag.
     */
    com.google.protobuf.ByteString
        getTagBytes();

    /**
     * <code>optional string log_message = 3;</code>
     * @return Whether the logMessage field is set.
     */
    boolean hasLogMessage();
    /**
     * <code>optional string log_message = 3;</code>
     * @return The logMessage.
     */
    java.lang.String getLogMessage();
    /**
     * <code>optional string log_message = 3;</code>
     * @return The bytes for logMessage.
     */
    com.google.protobuf.ByteString
        getLogMessageBytes();
  }
  /**
   * <pre>
   * Message for logging events GPU data producer.
   * </pre>
   *
   * Protobuf type {@code perfetto.protos.GpuLog}
   */
  public static final class GpuLog extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:perfetto.protos.GpuLog)
      GpuLogOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GpuLog.newBuilder() to construct.
    private GpuLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GpuLog() {
      severity_ = 0;
      tag_ = "";
      logMessage_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GpuLog();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return perfetto.protos.GpuLogOuterClass.internal_static_perfetto_protos_GpuLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return perfetto.protos.GpuLogOuterClass.internal_static_perfetto_protos_GpuLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              perfetto.protos.GpuLogOuterClass.GpuLog.class, perfetto.protos.GpuLogOuterClass.GpuLog.Builder.class);
    }

    /**
     * Protobuf enum {@code perfetto.protos.GpuLog.Severity}
     */
    public enum Severity
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>LOG_SEVERITY_UNSPECIFIED = 0;</code>
       */
      LOG_SEVERITY_UNSPECIFIED(0),
      /**
       * <code>LOG_SEVERITY_VERBOSE = 1;</code>
       */
      LOG_SEVERITY_VERBOSE(1),
      /**
       * <code>LOG_SEVERITY_DEBUG = 2;</code>
       */
      LOG_SEVERITY_DEBUG(2),
      /**
       * <code>LOG_SEVERITY_INFO = 3;</code>
       */
      LOG_SEVERITY_INFO(3),
      /**
       * <code>LOG_SEVERITY_WARNING = 4;</code>
       */
      LOG_SEVERITY_WARNING(4),
      /**
       * <code>LOG_SEVERITY_ERROR = 5;</code>
       */
      LOG_SEVERITY_ERROR(5),
      ;

      /**
       * <code>LOG_SEVERITY_UNSPECIFIED = 0;</code>
       */
      public static final int LOG_SEVERITY_UNSPECIFIED_VALUE = 0;
      /**
       * <code>LOG_SEVERITY_VERBOSE = 1;</code>
       */
      public static final int LOG_SEVERITY_VERBOSE_VALUE = 1;
      /**
       * <code>LOG_SEVERITY_DEBUG = 2;</code>
       */
      public static final int LOG_SEVERITY_DEBUG_VALUE = 2;
      /**
       * <code>LOG_SEVERITY_INFO = 3;</code>
       */
      public static final int LOG_SEVERITY_INFO_VALUE = 3;
      /**
       * <code>LOG_SEVERITY_WARNING = 4;</code>
       */
      public static final int LOG_SEVERITY_WARNING_VALUE = 4;
      /**
       * <code>LOG_SEVERITY_ERROR = 5;</code>
       */
      public static final int LOG_SEVERITY_ERROR_VALUE = 5;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Severity valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Severity forNumber(int value) {
        switch (value) {
          case 0: return LOG_SEVERITY_UNSPECIFIED;
          case 1: return LOG_SEVERITY_VERBOSE;
          case 2: return LOG_SEVERITY_DEBUG;
          case 3: return LOG_SEVERITY_INFO;
          case 4: return LOG_SEVERITY_WARNING;
          case 5: return LOG_SEVERITY_ERROR;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Severity>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Severity> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
              public Severity findValueByNumber(int number) {
                return Severity.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return perfetto.protos.GpuLogOuterClass.GpuLog.getDescriptor().getEnumTypes().get(0);
      }

      private static final Severity[] VALUES = values();

      public static Severity valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Severity(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:perfetto.protos.GpuLog.Severity)
    }

    private int bitField0_;
    public static final int SEVERITY_FIELD_NUMBER = 1;
    private int severity_ = 0;
    /**
     * <code>optional .perfetto.protos.GpuLog.Severity severity = 1;</code>
     * @return Whether the severity field is set.
     */
    @java.lang.Override public boolean hasSeverity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .perfetto.protos.GpuLog.Severity severity = 1;</code>
     * @return The severity.
     */
    @java.lang.Override public perfetto.protos.GpuLogOuterClass.GpuLog.Severity getSeverity() {
      perfetto.protos.GpuLogOuterClass.GpuLog.Severity result = perfetto.protos.GpuLogOuterClass.GpuLog.Severity.forNumber(severity_);
      return result == null ? perfetto.protos.GpuLogOuterClass.GpuLog.Severity.LOG_SEVERITY_UNSPECIFIED : result;
    }

    public static final int TAG_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object tag_ = "";
    /**
     * <code>optional string tag = 2;</code>
     * @return Whether the tag field is set.
     */
    @java.lang.Override
    public boolean hasTag() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string tag = 2;</code>
     * @return The tag.
     */
    @java.lang.Override
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tag_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string tag = 2;</code>
     * @return The bytes for tag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LOG_MESSAGE_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object logMessage_ = "";
    /**
     * <code>optional string log_message = 3;</code>
     * @return Whether the logMessage field is set.
     */
    @java.lang.Override
    public boolean hasLogMessage() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string log_message = 3;</code>
     * @return The logMessage.
     */
    @java.lang.Override
    public java.lang.String getLogMessage() {
      java.lang.Object ref = logMessage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          logMessage_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string log_message = 3;</code>
     * @return The bytes for logMessage.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLogMessageBytes() {
      java.lang.Object ref = logMessage_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeEnum(1, severity_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tag_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, logMessage_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, severity_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tag_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, logMessage_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof perfetto.protos.GpuLogOuterClass.GpuLog)) {
        return super.equals(obj);
      }
      perfetto.protos.GpuLogOuterClass.GpuLog other = (perfetto.protos.GpuLogOuterClass.GpuLog) obj;

      if (hasSeverity() != other.hasSeverity()) return false;
      if (hasSeverity()) {
        if (severity_ != other.severity_) return false;
      }
      if (hasTag() != other.hasTag()) return false;
      if (hasTag()) {
        if (!getTag()
            .equals(other.getTag())) return false;
      }
      if (hasLogMessage() != other.hasLogMessage()) return false;
      if (hasLogMessage()) {
        if (!getLogMessage()
            .equals(other.getLogMessage())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSeverity()) {
        hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
        hash = (53 * hash) + severity_;
      }
      if (hasTag()) {
        hash = (37 * hash) + TAG_FIELD_NUMBER;
        hash = (53 * hash) + getTag().hashCode();
      }
      if (hasLogMessage()) {
        hash = (37 * hash) + LOG_MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getLogMessage().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static perfetto.protos.GpuLogOuterClass.GpuLog parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.GpuLogOuterClass.GpuLog parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(perfetto.protos.GpuLogOuterClass.GpuLog prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Message for logging events GPU data producer.
     * </pre>
     *
     * Protobuf type {@code perfetto.protos.GpuLog}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:perfetto.protos.GpuLog)
        perfetto.protos.GpuLogOuterClass.GpuLogOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return perfetto.protos.GpuLogOuterClass.internal_static_perfetto_protos_GpuLog_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return perfetto.protos.GpuLogOuterClass.internal_static_perfetto_protos_GpuLog_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                perfetto.protos.GpuLogOuterClass.GpuLog.class, perfetto.protos.GpuLogOuterClass.GpuLog.Builder.class);
      }

      // Construct using perfetto.protos.GpuLogOuterClass.GpuLog.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        severity_ = 0;
        tag_ = "";
        logMessage_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return perfetto.protos.GpuLogOuterClass.internal_static_perfetto_protos_GpuLog_descriptor;
      }

      @java.lang.Override
      public perfetto.protos.GpuLogOuterClass.GpuLog getDefaultInstanceForType() {
        return perfetto.protos.GpuLogOuterClass.GpuLog.getDefaultInstance();
      }

      @java.lang.Override
      public perfetto.protos.GpuLogOuterClass.GpuLog build() {
        perfetto.protos.GpuLogOuterClass.GpuLog result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public perfetto.protos.GpuLogOuterClass.GpuLog buildPartial() {
        perfetto.protos.GpuLogOuterClass.GpuLog result = new perfetto.protos.GpuLogOuterClass.GpuLog(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(perfetto.protos.GpuLogOuterClass.GpuLog result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.severity_ = severity_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.tag_ = tag_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.logMessage_ = logMessage_;
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof perfetto.protos.GpuLogOuterClass.GpuLog) {
          return mergeFrom((perfetto.protos.GpuLogOuterClass.GpuLog)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(perfetto.protos.GpuLogOuterClass.GpuLog other) {
        if (other == perfetto.protos.GpuLogOuterClass.GpuLog.getDefaultInstance()) return this;
        if (other.hasSeverity()) {
          setSeverity(other.getSeverity());
        }
        if (other.hasTag()) {
          tag_ = other.tag_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasLogMessage()) {
          logMessage_ = other.logMessage_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                int tmpRaw = input.readEnum();
                perfetto.protos.GpuLogOuterClass.GpuLog.Severity tmpValue =
                    perfetto.protos.GpuLogOuterClass.GpuLog.Severity.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(1, tmpRaw);
                } else {
                  severity_ = tmpRaw;
                  bitField0_ |= 0x00000001;
                }
                break;
              } // case 8
              case 18: {
                tag_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                logMessage_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int severity_ = 0;
      /**
       * <code>optional .perfetto.protos.GpuLog.Severity severity = 1;</code>
       * @return Whether the severity field is set.
       */
      @java.lang.Override public boolean hasSeverity() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .perfetto.protos.GpuLog.Severity severity = 1;</code>
       * @return The severity.
       */
      @java.lang.Override
      public perfetto.protos.GpuLogOuterClass.GpuLog.Severity getSeverity() {
        perfetto.protos.GpuLogOuterClass.GpuLog.Severity result = perfetto.protos.GpuLogOuterClass.GpuLog.Severity.forNumber(severity_);
        return result == null ? perfetto.protos.GpuLogOuterClass.GpuLog.Severity.LOG_SEVERITY_UNSPECIFIED : result;
      }
      /**
       * <code>optional .perfetto.protos.GpuLog.Severity severity = 1;</code>
       * @param value The severity to set.
       * @return This builder for chaining.
       */
      public Builder setSeverity(perfetto.protos.GpuLogOuterClass.GpuLog.Severity value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        severity_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .perfetto.protos.GpuLog.Severity severity = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeverity() {
        bitField0_ = (bitField0_ & ~0x00000001);
        severity_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object tag_ = "";
      /**
       * <code>optional string tag = 2;</code>
       * @return Whether the tag field is set.
       */
      public boolean hasTag() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string tag = 2;</code>
       * @return The tag.
       */
      public java.lang.String getTag() {
        java.lang.Object ref = tag_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            tag_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string tag = 2;</code>
       * @return The bytes for tag.
       */
      public com.google.protobuf.ByteString
          getTagBytes() {
        java.lang.Object ref = tag_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tag_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string tag = 2;</code>
       * @param value The tag to set.
       * @return This builder for chaining.
       */
      public Builder setTag(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        tag_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional string tag = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTag() {
        tag_ = getDefaultInstance().getTag();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>optional string tag = 2;</code>
       * @param value The bytes for tag to set.
       * @return This builder for chaining.
       */
      public Builder setTagBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        tag_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object logMessage_ = "";
      /**
       * <code>optional string log_message = 3;</code>
       * @return Whether the logMessage field is set.
       */
      public boolean hasLogMessage() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string log_message = 3;</code>
       * @return The logMessage.
       */
      public java.lang.String getLogMessage() {
        java.lang.Object ref = logMessage_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            logMessage_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string log_message = 3;</code>
       * @return The bytes for logMessage.
       */
      public com.google.protobuf.ByteString
          getLogMessageBytes() {
        java.lang.Object ref = logMessage_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          logMessage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string log_message = 3;</code>
       * @param value The logMessage to set.
       * @return This builder for chaining.
       */
      public Builder setLogMessage(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        logMessage_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional string log_message = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLogMessage() {
        logMessage_ = getDefaultInstance().getLogMessage();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>optional string log_message = 3;</code>
       * @param value The bytes for logMessage to set.
       * @return This builder for chaining.
       */
      public Builder setLogMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        logMessage_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:perfetto.protos.GpuLog)
    }

    // @@protoc_insertion_point(class_scope:perfetto.protos.GpuLog)
    private static final perfetto.protos.GpuLogOuterClass.GpuLog DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new perfetto.protos.GpuLogOuterClass.GpuLog();
    }

    public static perfetto.protos.GpuLogOuterClass.GpuLog getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<GpuLog>
        PARSER = new com.google.protobuf.AbstractParser<GpuLog>() {
      @java.lang.Override
      public GpuLog parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<GpuLog> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GpuLog> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public perfetto.protos.GpuLogOuterClass.GpuLog getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_perfetto_protos_GpuLog_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_perfetto_protos_GpuLog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'protos/perfetto/trace/gpu/gpu_log.prot" +
      "o\022\017perfetto.protos\"\204\002\n\006GpuLog\0222\n\010severit" +
      "y\030\001 \001(\0162 .perfetto.protos.GpuLog.Severit" +
      "y\022\013\n\003tag\030\002 \001(\t\022\023\n\013log_message\030\003 \001(\t\"\243\001\n\010" +
      "Severity\022\034\n\030LOG_SEVERITY_UNSPECIFIED\020\000\022\030" +
      "\n\024LOG_SEVERITY_VERBOSE\020\001\022\026\n\022LOG_SEVERITY" +
      "_DEBUG\020\002\022\025\n\021LOG_SEVERITY_INFO\020\003\022\030\n\024LOG_S" +
      "EVERITY_WARNING\020\004\022\026\n\022LOG_SEVERITY_ERROR\020" +
      "\005"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_perfetto_protos_GpuLog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_perfetto_protos_GpuLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_perfetto_protos_GpuLog_descriptor,
        new java.lang.String[] { "Severity", "Tag", "LogMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}