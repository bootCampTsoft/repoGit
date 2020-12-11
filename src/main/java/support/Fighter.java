package support;

class Fighter
{
    static int count;  // CLASS VARIABLE: how many fighters there are

    int strength = 1;      // my strength
    int direction;         // direction I'm facing
    Battleground place;    // the support.Battleground that I fight on
    int row, column;       // where I am
    int newRow, newColumn; // where I want to be
    int lastMoved = -1;    // last turn that I did something

    Fighter (Battleground place, int row, int column)  // Construct a support.Fighter.
    {
        direction = (int) (Math.random () * 4);  // face in a direction 0 to 3
        this.place = place;                      // remember my battleground
        this.row = row;                          // remember my location
        this.column = column;
        count++;                                 // count me
    }

    void doSomething (int step)
    {
        // If I've already moved, don't move again
        if (step == lastMoved) return;
        else lastMoved = step;

        // sometimes change direction (about 10% of the time)
        if (Math.random () < 0.10) direction = (int) (Math.random () * 4);

        // figure out where I want to be
        newRow = row; newColumn = column;
        switch (direction)
        {
            case 0: newRow = (row + 1) % place.size;                    break;
            case 1: newRow = (place.size + row - 1) % place.size;       break;
            case 2: newColumn = (column + 1) % place.size;              break;
            case 3: newColumn = (place.size + column - 1) % place.size; break;
        }

        // if that space is occupied, fight for it, else just move there
        if (place.warzone [newRow][newColumn] != null)
            fight (newRow, newColumn);
        else
            move (newRow, newColumn);
    }

    void move (int newRow, int newCol)      // Do a simple, uncontested move
    {
        place.warzone [row][column] = null;        // Move from here
        place.warzone [newRow][newColumn] = this;  // to here, and
        row = newRow; column = newColumn;          // remember where I am now.
    }

    void fight (int newRow, int newColumn) // Fight someone in that location
    {
        Fighter opponent = place.warzone [newRow][newColumn];

        if (strength >= opponent.strength)   // If I win,
        {
            strength += opponent.strength;   // take my opponent's strength
            move (newRow, newColumn);        // and position;
            Fighter.count--;                 // he's gone now, reduce count.
        }
        else
        {
            opponent.strength += strength;        // But if I lose,
            place.warzone [row][column] = null;   // erase myself
            Fighter.count--;                      // and count me gone.
        }
    }

    public String toString ()       // Represent a fighter by just his strength
    {
        if (strength < 10) return " " + strength;  // add a blank if < 10
        else return "" + strength;                 // else just convert to String
    }
}