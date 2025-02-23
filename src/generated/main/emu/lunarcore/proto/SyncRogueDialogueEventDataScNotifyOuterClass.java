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
import us.hebi.quickbuf.RepeatedMessage;

public final class SyncRogueDialogueEventDataScNotifyOuterClass {
  /**
   * Protobuf type {@code SyncRogueDialogueEventDataScNotify}
   */
  public static final class SyncRogueDialogueEventDataScNotify extends ProtoMessage<SyncRogueDialogueEventDataScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .RogueDialogueEvent rogue_dialogue_event = 4;</code>
     */
    private final RepeatedMessage<RogueDialogueEventOuterClass.RogueDialogueEvent> rogueDialogueEvent = RepeatedMessage.newEmptyInstance(RogueDialogueEventOuterClass.RogueDialogueEvent.getFactory());

    private SyncRogueDialogueEventDataScNotify() {
    }

    /**
     * @return a new empty instance of {@code SyncRogueDialogueEventDataScNotify}
     */
    public static SyncRogueDialogueEventDataScNotify newInstance() {
      return new SyncRogueDialogueEventDataScNotify();
    }

    /**
     * <code>repeated .RogueDialogueEvent rogue_dialogue_event = 4;</code>
     * @return whether the rogueDialogueEvent field is set
     */
    public boolean hasRogueDialogueEvent() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .RogueDialogueEvent rogue_dialogue_event = 4;</code>
     * @return this
     */
    public SyncRogueDialogueEventDataScNotify clearRogueDialogueEvent() {
      bitField0_ &= ~0x00000001;
      rogueDialogueEvent.clear();
      return this;
    }

    /**
     * <code>repeated .RogueDialogueEvent rogue_dialogue_event = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueDialogueEvent()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RogueDialogueEventOuterClass.RogueDialogueEvent> getRogueDialogueEvent(
        ) {
      return rogueDialogueEvent;
    }

    /**
     * <code>repeated .RogueDialogueEvent rogue_dialogue_event = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RogueDialogueEventOuterClass.RogueDialogueEvent> getMutableRogueDialogueEvent(
        ) {
      bitField0_ |= 0x00000001;
      return rogueDialogueEvent;
    }

    /**
     * <code>repeated .RogueDialogueEvent rogue_dialogue_event = 4;</code>
     * @param value the rogueDialogueEvent to add
     * @return this
     */
    public SyncRogueDialogueEventDataScNotify addRogueDialogueEvent(
        final RogueDialogueEventOuterClass.RogueDialogueEvent value) {
      bitField0_ |= 0x00000001;
      rogueDialogueEvent.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueDialogueEvent rogue_dialogue_event = 4;</code>
     * @param values the rogueDialogueEvent to add
     * @return this
     */
    public SyncRogueDialogueEventDataScNotify addAllRogueDialogueEvent(
        final RogueDialogueEventOuterClass.RogueDialogueEvent... values) {
      bitField0_ |= 0x00000001;
      rogueDialogueEvent.addAll(values);
      return this;
    }

    @Override
    public SyncRogueDialogueEventDataScNotify copyFrom(
        final SyncRogueDialogueEventDataScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueDialogueEvent.copyFrom(other.rogueDialogueEvent);
      }
      return this;
    }

    @Override
    public SyncRogueDialogueEventDataScNotify mergeFrom(
        final SyncRogueDialogueEventDataScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueDialogueEvent()) {
        getMutableRogueDialogueEvent().addAll(other.rogueDialogueEvent);
      }
      return this;
    }

    @Override
    public SyncRogueDialogueEventDataScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueDialogueEvent.clear();
      return this;
    }

    @Override
    public SyncRogueDialogueEventDataScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueDialogueEvent.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SyncRogueDialogueEventDataScNotify)) {
        return false;
      }
      SyncRogueDialogueEventDataScNotify other = (SyncRogueDialogueEventDataScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueDialogueEvent() || rogueDialogueEvent.equals(other.rogueDialogueEvent));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < rogueDialogueEvent.length(); i++) {
          output.writeRawByte((byte) 34);
          output.writeMessageNoTag(rogueDialogueEvent.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * rogueDialogueEvent.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(rogueDialogueEvent);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncRogueDialogueEventDataScNotify mergeFrom(final ProtoSource input) throws
        IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 34: {
            // rogueDialogueEvent
            tag = input.readRepeatedMessage(rogueDialogueEvent, tag);
            bitField0_ |= 0x00000001;
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
        output.writeRepeatedMessage(FieldNames.rogueDialogueEvent, rogueDialogueEvent);
      }
      output.endObject();
    }

    @Override
    public SyncRogueDialogueEventDataScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1631556584:
          case -76730760: {
            if (input.isAtField(FieldNames.rogueDialogueEvent)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(rogueDialogueEvent);
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
    public SyncRogueDialogueEventDataScNotify clone() {
      return new SyncRogueDialogueEventDataScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncRogueDialogueEventDataScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncRogueDialogueEventDataScNotify(), data).checkInitialized();
    }

    public static SyncRogueDialogueEventDataScNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SyncRogueDialogueEventDataScNotify(), input).checkInitialized();
    }

    public static SyncRogueDialogueEventDataScNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SyncRogueDialogueEventDataScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncRogueDialogueEventDataScNotify messages
     */
    public static MessageFactory<SyncRogueDialogueEventDataScNotify> getFactory() {
      return SyncRogueDialogueEventDataScNotifyFactory.INSTANCE;
    }

    private enum SyncRogueDialogueEventDataScNotifyFactory implements MessageFactory<SyncRogueDialogueEventDataScNotify> {
      INSTANCE;

      @Override
      public SyncRogueDialogueEventDataScNotify create() {
        return SyncRogueDialogueEventDataScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueDialogueEvent = FieldName.forField("rogueDialogueEvent", "rogue_dialogue_event");
    }
  }
}
