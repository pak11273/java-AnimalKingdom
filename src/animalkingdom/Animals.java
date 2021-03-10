package animalkingdom;

abstract class Animals
{
    protected int food;
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int year;


    public Animals()
    {
        food = 1;
        id = maxId;
        maxId++;
    }

    public Animals(String name, int year)
    {
        food = 1;
        this.id = maxId;
        maxId++;
        this.name = name;
        this.year = year;
    }

    abstract String eat();

    // public void eat(String snack)
    // {
    // food = food + snack;
    // }

    abstract String move();

    abstract String breath();

    abstract String reproduce();

    abstract String getName();

    abstract int getYear();

    @Override
    public String toString()
    {
        return "Animals{" + "id= " + id + "name = " + name + "year = " + year + "}" + "\n";
    }

}
