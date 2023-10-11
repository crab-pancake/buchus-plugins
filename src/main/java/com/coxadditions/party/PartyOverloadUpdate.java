package com.coxadditions.party;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;
import net.runelite.client.party.messages.PartyMemberMessage;

@Value
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PartyOverloadUpdate extends PartyMemberMessage
{
	String player;
	int world;
}