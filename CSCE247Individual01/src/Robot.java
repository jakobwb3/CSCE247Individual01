
public abstract class Robot 
{
	protected String name;
	protected MoveBehavior moveBehavior;
	protected TalkBehavior talkBehavior;
	
	public Robot(String name)
	{
		this.name = name;
	}
	
	public void setMoveBehavior(MoveBehavior mb)
	{
		moveBehavior = mb;
	}
	
	public void setTalkBehavior(TalkBehavior tb)
	{
		talkBehavior = tb;
	}
	
	public String move()
	{
		return moveBehavior.move();
	}
	
	public String talk()
	{
		return talkBehavior.talk();
	}
	
	public abstract String toString();
}
