// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class RogueCommonBuffSelectResultOuterClass {
  /**
   * Protobuf type {@code RogueCommonBuffSelectResult}
   */
  public static final class RogueCommonBuffSelectResult extends ProtoMessage<RogueCommonBuffSelectResult> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 buff_id = 3;</code>
     */
    private int buffId;

    private RogueCommonBuffSelectResult() {
    }

    /**
     * @return a new empty instance of {@code RogueCommonBuffSelectResult}
     */
    public static RogueCommonBuffSelectResult newInstance() {
      return new RogueCommonBuffSelectResult();
    }

    /**
     * <code>optional uint32 buff_id = 3;</code>
     * @return whether the buffId field is set
     */
    public boolean hasBuffId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 buff_id = 3;</code>
     * @return this
     */
    public RogueCommonBuffSelectResult clearBuffId() {
      bitField0_ &= ~0x00000001;
      buffId = 0;
      return this;
    }

    /**
     * <code>optional uint32 buff_id = 3;</code>
     * @return the buffId
     */
    public int getBuffId() {
      return buffId;
    }

    /**
     * <code>optional uint32 buff_id = 3;</code>
     * @param value the buffId to set
     * @return this
     */
    public RogueCommonBuffSelectResult setBuffId(final int value) {
      bitField0_ |= 0x00000001;
      buffId = value;
      return this;
    }

    @Override
    public RogueCommonBuffSelectResult copyFrom(final RogueCommonBuffSelectResult other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        buffId = other.buffId;
      }
      return this;
    }

    @Override
    public RogueCommonBuffSelectResult mergeFrom(final RogueCommonBuffSelectResult other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBuffId()) {
        setBuffId(other.buffId);
      }
      return this;
    }

    @Override
    public RogueCommonBuffSelectResult clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffId = 0;
      return this;
    }

    @Override
    public RogueCommonBuffSelectResult clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueCommonBuffSelectResult)) {
        return false;
      }
      RogueCommonBuffSelectResult other = (RogueCommonBuffSelectResult) o;
      return bitField0_ == other.bitField0_
        && (!hasBuffId() || buffId == other.buffId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(buffId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(buffId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueCommonBuffSelectResult mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // buffId
            buffId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.buffId, buffId);
      }
      output.endObject();
    }

    @Override
    public RogueCommonBuffSelectResult mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1378119474:
          case 227990663: {
            if (input.isAtField(FieldNames.buffId)) {
              if (!input.trySkipNullValue()) {
                buffId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RogueCommonBuffSelectResult clone() {
      return new RogueCommonBuffSelectResult().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueCommonBuffSelectResult parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueCommonBuffSelectResult(), data).checkInitialized();
    }

    public static RogueCommonBuffSelectResult parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new RogueCommonBuffSelectResult(), input).checkInitialized();
    }

    public static RogueCommonBuffSelectResult parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCommonBuffSelectResult(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueCommonBuffSelectResult messages
     */
    public static MessageFactory<RogueCommonBuffSelectResult> getFactory() {
      return RogueCommonBuffSelectResultFactory.INSTANCE;
    }

    private enum RogueCommonBuffSelectResultFactory implements MessageFactory<RogueCommonBuffSelectResult> {
      INSTANCE;

      @Override
      public RogueCommonBuffSelectResult create() {
        return RogueCommonBuffSelectResult.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName buffId = FieldName.forField("buffId", "buff_id");
    }
  }
}
