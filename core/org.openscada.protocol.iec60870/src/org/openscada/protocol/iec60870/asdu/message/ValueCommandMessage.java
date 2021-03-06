package org.openscada.protocol.iec60870.asdu.message;

import org.openscada.protocol.iec60870.asdu.ASDUHeader;
import org.openscada.protocol.iec60870.asdu.types.CommandValue;
import org.openscada.protocol.iec60870.asdu.types.InformationObjectAddress;

public interface ValueCommandMessage extends MirrorableMessage<ValueCommandMessage>
{
    public ASDUHeader getHeader ();

    public InformationObjectAddress getInformationObjectAddress ();

    public CommandValue<?> getValue ();

    public byte getType ();

    public boolean isExecute ();
}
