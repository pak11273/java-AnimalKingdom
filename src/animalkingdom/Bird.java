package animalkingdom;

public class Bird extends Animals
{

    public Bird(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String eat()
    {
        return "Eat";
    }

    @Override
    public String move()
    {
        return "Fly";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public int getYear()
    {
        return year;
    }


}
