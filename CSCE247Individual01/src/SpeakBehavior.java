import java.util.Random;

public class SpeakBehavior implements TalkBehavior
{
	public String talk()
	{
		Random r = new Random();
		int randNum = r.nextInt(3);
		if(randNum == 0)
			return "Hello";
		else if(randNum == 1)
			return "How are you?";
		else
			return "Good day";
	}
}
