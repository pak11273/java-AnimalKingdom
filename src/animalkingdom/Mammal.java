package animalkingdom;

public class Mammal extends Animals
{

    public Mammal(String name, int year)
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
        return "Walk";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    // @Override
    // public int getYear()
    // {
    // return year;
    // }
}
