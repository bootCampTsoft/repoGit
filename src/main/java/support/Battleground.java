package support;

public class Battleground {
    int size;              // size of the battleground
    Fighter[][] warzone;  // array representing the battleground

    Battleground(int size)                   // Construct a support.Battleground.
    {
        warzone = new Fighter[size][size];     // Make the array
        this.size = size;                       // and remember how big it is.

        for (int i = 0; i < size; i++)          // Put a support.Fighter in 25% of
            for (int j = 0; j < size; j++)        // squares (the rest are initially
                if (Math.random() < 0.25)          // null).
                    warzone[i][j] = new Fighter(this, i, j);
    }

    void print()                             // Print the support.Battleground.
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (warzone[i][j] == null) System.out.print(" --");
                else System.out.print(" " + warzone[i][j]);
            }
            System.out.println();
        }
    }

    public static void main (String args[])
    {/*
        final int SIZE = 10;   // Constant: size of battleground
        final int STEPS = 10;  // Constant: number of steps to run simulation
        Battleground battleground = new Battleground (SIZE); // Make battleground.
        for (int step = 0; step < STEPS; step++)            // Run for STEPS steps.
        {
            System.out.println ("Step " + step + ", " + Fighter.count + " fighters:");
            battleground.print ();
            if (Fighter.count == 1) break;     // Quit early if we have a winner,
            for (int i = 0; i < SIZE; i++)     // else loop through battleground
                for (int j = 0; j < SIZE; j++)   // and let each support.Fighter doSomething.
                    if (battleground.warzone[i][j] instanceof Fighter)
                        battleground.warzone[i][j].doSomething (step);
        }
        System.out.println ("At end (" + Fighter.count + " fighters left):");
        battleground.print ();
    */



    }
}