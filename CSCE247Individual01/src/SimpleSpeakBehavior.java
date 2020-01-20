import java.util.Random;

public class SimpleSpeakBehavior implements TalkBehavior
{
	public String talk()
	{
		Random r = new Random();
		int randNum = r.nextInt(5);
		if(randNum == 0)
			return "Wall-E";
		else if(randNum == 1)
			return "EVA!";
		else if(randNum == 2)
			return "Pop";
		else if(randNum == 3)
			return "Eva?";
		else
			return "Eee-va?";
	}
}
