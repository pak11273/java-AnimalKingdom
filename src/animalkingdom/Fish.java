package animalkingdom;

public class Fish extends Animals
{

    public Fish(String name, int year)
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
        return "Swim";
    }

    @Override
    public String breath()
    {
        return "Gills";
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
