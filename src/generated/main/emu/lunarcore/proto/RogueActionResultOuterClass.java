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

public final class RogueActionResultOuterClass {
  /**
   * Protobuf type {@code RogueActionResult}
   */
  public static final class RogueActionResult extends ProtoMessage<RogueActionResult> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueBuffSource source = 7;</code>
     */
    private int source;

    /**
     * <code>optional .RogueActionResultData action_data = 11;</code>
     */
    private final RogueActionResultDataOuterClass.RogueActionResultData actionData = RogueActionResultDataOuterClass.RogueActionResultData.newInstance();

    private RogueActionResult() {
    }

    /**
     * @return a new empty instance of {@code RogueActionResult}
     */
    public static RogueActionResult newInstance() {
      return new RogueActionResult();
    }

    /**
     * <code>optional .RogueBuffSource source = 7;</code>
     * @return whether the source field is set
     */
    public boolean hasSource() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueBuffSource source = 7;</code>
     * @return this
     */
    public RogueActionResult clearSource() {
      bitField0_ &= ~0x00000001;
      source = 0;
      return this;
    }

    /**
     * <code>optional .RogueBuffSource source = 7;</code>
     * @return the source
     */
    public RogueBuffSourceOuterClass.RogueBuffSource getSource() {
      return RogueBuffSourceOuterClass.RogueBuffSource.forNumber(source);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link RogueActionResult#getSource()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getSourceValue() {
      return source;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link RogueBuffSourceOuterClass.RogueBuffSource}. Setting an invalid value
     * can cause {@link RogueActionResult#getSource()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public RogueActionResult setSourceValue(final int value) {
      bitField0_ |= 0x00000001;
      source = value;
      return this;
    }

    /**
     * <code>optional .RogueBuffSource source = 7;</code>
     * @param value the source to set
     * @return this
     */
    public RogueActionResult setSource(final RogueBuffSourceOuterClass.RogueBuffSource value) {
      bitField0_ |= 0x00000001;
      source = value.getNumber();
      return this;
    }

    /**
     * <code>optional .RogueActionResultData action_data = 11;</code>
     * @return whether the actionData field is set
     */
    public boolean hasActionData() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueActionResultData action_data = 11;</code>
     * @return this
     */
    public RogueActionResult clearActionData() {
      bitField0_ &= ~0x00000002;
      actionData.clear();
      return this;
    }

    /**
     * <code>optional .RogueActionResultData action_data = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableActionData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueActionResultDataOuterClass.RogueActionResultData getActionData() {
      return actionData;
    }

    /**
     * <code>optional .RogueActionResultData action_data = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueActionResultDataOuterClass.RogueActionResultData getMutableActionData() {
      bitField0_ |= 0x00000002;
      return actionData;
    }

    /**
     * <code>optional .RogueActionResultData action_data = 11;</code>
     * @param value the actionData to set
     * @return this
     */
    public RogueActionResult setActionData(
        final RogueActionResultDataOuterClass.RogueActionResultData value) {
      bitField0_ |= 0x00000002;
      actionData.copyFrom(value);
      return this;
    }

    @Override
    public RogueActionResult copyFrom(final RogueActionResult other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        source = other.source;
        actionData.copyFrom(other.actionData);
      }
      return this;
    }

    @Override
    public RogueActionResult mergeFrom(final RogueActionResult other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSource()) {
        setSourceValue(other.source);
      }
      if (other.hasActionData()) {
        getMutableActionData().mergeFrom(other.actionData);
      }
      return this;
    }

    @Override
    public RogueActionResult clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      source = 0;
      actionData.clear();
      return this;
    }

    @Override
    public RogueActionResult clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      actionData.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueActionResult)) {
        return false;
      }
      RogueActionResult other = (RogueActionResult) o;
      return bitField0_ == other.bitField0_
        && (!hasSource() || source == other.source)
        && (!hasActionData() || actionData.equals(other.actionData));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeEnumNoTag(source);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(actionData);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(source);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(actionData);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueActionResult mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // source
            final int value = input.readInt32();
            if (RogueBuffSourceOuterClass.RogueBuffSource.forNumber(value) != null) {
              source = value;
              bitField0_ |= 0x00000001;
            }
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // actionData
            input.readMessage(actionData);
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
        output.writeEnum(FieldNames.source, source, RogueBuffSourceOuterClass.RogueBuffSource.converter());
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.actionData, actionData);
      }
      output.endObject();
    }

    @Override
    public RogueActionResult mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -896505829: {
            if (input.isAtField(FieldNames.source)) {
              if (!input.trySkipNullValue()) {
                final RogueBuffSourceOuterClass.RogueBuffSource value = input.readEnum(RogueBuffSourceOuterClass.RogueBuffSource.converter());
                if (value != null) {
                  source = value.getNumber();
                  bitField0_ |= 0x00000001;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1851381504:
          case 1583258643: {
            if (input.isAtField(FieldNames.actionData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(actionData);
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
    public RogueActionResult clone() {
      return new RogueActionResult().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueActionResult parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueActionResult(), data).checkInitialized();
    }

    public static RogueActionResult parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueActionResult(), input).checkInitialized();
    }

    public static RogueActionResult parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueActionResult(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueActionResult messages
     */
    public static MessageFactory<RogueActionResult> getFactory() {
      return RogueActionResultFactory.INSTANCE;
    }

    private enum RogueActionResultFactory implements MessageFactory<RogueActionResult> {
      INSTANCE;

      @Override
      public RogueActionResult create() {
        return RogueActionResult.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName source = FieldName.forField("source");

      static final FieldName actionData = FieldName.forField("actionData", "action_data");
    }
  }
}
