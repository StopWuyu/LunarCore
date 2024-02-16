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

public final class RogueCommonBuffOuterClass {
  /**
   * Protobuf type {@code RogueCommonBuff}
   */
  public static final class RogueCommonBuff extends ProtoMessage<RogueCommonBuff> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 level = 3;</code>
     */
    private int level;

    /**
     * <code>optional uint32 buff_id = 13;</code>
     */
    private int buffId;

    private RogueCommonBuff() {
    }

    /**
     * @return a new empty instance of {@code RogueCommonBuff}
     */
    public static RogueCommonBuff newInstance() {
      return new RogueCommonBuff();
    }

    /**
     * <code>optional uint32 level = 3;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 level = 3;</code>
     * @return this
     */
    public RogueCommonBuff clearLevel() {
      bitField0_ &= ~0x00000001;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 3;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 3;</code>
     * @param value the level to set
     * @return this
     */
    public RogueCommonBuff setLevel(final int value) {
      bitField0_ |= 0x00000001;
      level = value;
      return this;
    }

    /**
     * <code>optional uint32 buff_id = 13;</code>
     * @return whether the buffId field is set
     */
    public boolean hasBuffId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 buff_id = 13;</code>
     * @return this
     */
    public RogueCommonBuff clearBuffId() {
      bitField0_ &= ~0x00000002;
      buffId = 0;
      return this;
    }

    /**
     * <code>optional uint32 buff_id = 13;</code>
     * @return the buffId
     */
    public int getBuffId() {
      return buffId;
    }

    /**
     * <code>optional uint32 buff_id = 13;</code>
     * @param value the buffId to set
     * @return this
     */
    public RogueCommonBuff setBuffId(final int value) {
      bitField0_ |= 0x00000002;
      buffId = value;
      return this;
    }

    @Override
    public RogueCommonBuff copyFrom(final RogueCommonBuff other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        level = other.level;
        buffId = other.buffId;
      }
      return this;
    }

    @Override
    public RogueCommonBuff mergeFrom(final RogueCommonBuff other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasBuffId()) {
        setBuffId(other.buffId);
      }
      return this;
    }

    @Override
    public RogueCommonBuff clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      level = 0;
      buffId = 0;
      return this;
    }

    @Override
    public RogueCommonBuff clearQuick() {
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
      if (!(o instanceof RogueCommonBuff)) {
        return false;
      }
      RogueCommonBuff other = (RogueCommonBuff) o;
      return bitField0_ == other.bitField0_
        && (!hasLevel() || level == other.level)
        && (!hasBuffId() || buffId == other.buffId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(buffId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(buffId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueCommonBuff mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // buffId
            buffId = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.buffId, buffId);
      }
      output.endObject();
    }

    @Override
    public RogueCommonBuff mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1378119474:
          case 227990663: {
            if (input.isAtField(FieldNames.buffId)) {
              if (!input.trySkipNullValue()) {
                buffId = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public RogueCommonBuff clone() {
      return new RogueCommonBuff().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueCommonBuff parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueCommonBuff(), data).checkInitialized();
    }

    public static RogueCommonBuff parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCommonBuff(), input).checkInitialized();
    }

    public static RogueCommonBuff parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCommonBuff(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueCommonBuff messages
     */
    public static MessageFactory<RogueCommonBuff> getFactory() {
      return RogueCommonBuffFactory.INSTANCE;
    }

    private enum RogueCommonBuffFactory implements MessageFactory<RogueCommonBuff> {
      INSTANCE;

      @Override
      public RogueCommonBuff create() {
        return RogueCommonBuff.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName level = FieldName.forField("level");

      static final FieldName buffId = FieldName.forField("buffId", "buff_id");
    }
  }
}
