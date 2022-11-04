package Command;

import Command.Command;

public class PasteCommand implements Command {
	//ConcreteCommand
	private Document dc;
	
	public PasteCommand(Document dc) {
		this.dc = dc;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		dc.paste();
	}

}
