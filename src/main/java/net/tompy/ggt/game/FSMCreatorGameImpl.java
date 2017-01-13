package net.tompy.ggt.game;

import net.tompy.gameai.fsm.FSMCreator;
import net.tompy.gameai.fsm.FiniteStateMachine;
import net.tompy.gameai.fsm.FiniteStateMachineBasicImpl;

public class FSMCreatorGameImpl implements FSMCreator<GameTemplate> 
{
	@Override
	public FiniteStateMachine<GameTemplate> create( GameTemplate owner ) 
	{
		FiniteStateMachine< GameTemplate > returnValue = new FiniteStateMachineBasicImpl< GameTemplate >();
		
		returnValue.setOwner( owner );
		
		return returnValue;
	}

}
