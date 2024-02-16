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

public final class SceneEnterStageCsReqOuterClass {
  /**
   * Protobuf type {@code SceneEnterStageCsReq}
   */
  public static final class SceneEnterStageCsReq extends ProtoMessage<SceneEnterStageCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 stage_id = 11;</code>
     */
    private int stageId;

    private SceneEnterStageCsReq() {
    }

    /**
     * @return a new empty instance of {@code SceneEnterStageCsReq}
     */
    public static SceneEnterStageCsReq newInstance() {
      return new SceneEnterStageCsReq();
    }

    /**
     * <code>optional uint32 stage_id = 11;</code>
     * @return whether the stageId field is set
     */
    public boolean hasStageId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 stage_id = 11;</code>
     * @return this
     */
    public SceneEnterStageCsReq clearStageId() {
      bitField0_ &= ~0x00000001;
      stageId = 0;
      return this;
    }

    /**
     * <code>optional uint32 stage_id = 11;</code>
     * @return the stageId
     */
    public int getStageId() {
      return stageId;
    }

    /**
     * <code>optional uint32 stage_id = 11;</code>
     * @param value the stageId to set
     * @return this
     */
    public SceneEnterStageCsReq setStageId(final int value) {
      bitField0_ |= 0x00000001;
      stageId = value;
      return this;
    }

    @Override
    public SceneEnterStageCsReq copyFrom(final SceneEnterStageCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        stageId = other.stageId;
      }
      return this;
    }

    @Override
    public SceneEnterStageCsReq mergeFrom(final SceneEnterStageCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasStageId()) {
        setStageId(other.stageId);
      }
      return this;
    }

    @Override
    public SceneEnterStageCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      stageId = 0;
      return this;
    }

    @Override
    public SceneEnterStageCsReq clearQuick() {
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
      if (!(o instanceof SceneEnterStageCsReq)) {
        return false;
      }
      SceneEnterStageCsReq other = (SceneEnterStageCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasStageId() || stageId == other.stageId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(stageId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stageId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneEnterStageCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // stageId
            stageId = input.readUInt32();
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
        output.writeUInt32(FieldNames.stageId, stageId);
      }
      output.endObject();
    }

    @Override
    public SceneEnterStageCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1897528135:
          case 1306191356: {
            if (input.isAtField(FieldNames.stageId)) {
              if (!input.trySkipNullValue()) {
                stageId = input.readUInt32();
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
    public SceneEnterStageCsReq clone() {
      return new SceneEnterStageCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneEnterStageCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneEnterStageCsReq(), data).checkInitialized();
    }

    public static SceneEnterStageCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEnterStageCsReq(), input).checkInitialized();
    }

    public static SceneEnterStageCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEnterStageCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneEnterStageCsReq messages
     */
    public static MessageFactory<SceneEnterStageCsReq> getFactory() {
      return SceneEnterStageCsReqFactory.INSTANCE;
    }

    private enum SceneEnterStageCsReqFactory implements MessageFactory<SceneEnterStageCsReq> {
      INSTANCE;

      @Override
      public SceneEnterStageCsReq create() {
        return SceneEnterStageCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName stageId = FieldName.forField("stageId", "stage_id");
    }
  }
}
