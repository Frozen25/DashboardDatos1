package Grafos;



public class Prim
{
   /* ------------------------------------------
      Data structure used to represent a graph
      ------------------------------------------ */
   private static int infinite = 9999999;

   int[][]  LinkCost;
   int      NNodes;


   /* -------------------------------
      Construct a graph of N nodes
      ------------------------------- */
   public Prim(int[][] mat)
   {
      int i, j;

      NNodes = mat.length;

      LinkCost = new int[NNodes][NNodes];

      for ( i=0; i < NNodes; i++)
      {
         for ( j=0; j < NNodes; j++)
         {
            LinkCost[i][j] = mat[i][j];

            if ( LinkCost[i][j] == 0 )
               LinkCost[i][j] = infinite;
         }
      }

      for ( i=0; i < NNodes; i++)
      {
         for ( j=0; j < NNodes; j++)
            if ( LinkCost[i][j] < infinite )
                 System.out.print("");
               //System.out.print( " " + LinkCost[i][j] + " " );
            else
                System.out.print("");
              // System.out.print(" * " );

       //  System.out.println();
      }
   }


   public int unReached(boolean[] r)
   {
      boolean done = true;

      for ( int i = 0; i < r.length; i++ )
         if ( r[i] == false )
            return i;

      return -1;
   }


   public void prim( )
   {
      int i, j, k, x, y;

      boolean[] Reached = new boolean[NNodes];	// Reach/unreach nodes
      int[] predNode = new int[NNodes];		// Remember min cost edge

      // Start at a vertex, I picked the start node = 0

      Reached[0] = true;

      // Other vertices are not reached 

      for ( k = 1; k < NNodes; k++ )
      {
         Reached[k] = false;
      }

      predNode[0] = 0;      // No edge for node 0

      printReachSet( Reached );

      /* =====================================================
         UnReachSet will decreas by 1 node in each iteration
	 There are NNodes-1 unreached nodes; so we can loop
	 NNodes-1 times and UnReachSet will become empty !
	 =====================================================  */
      for (k = 1; k < NNodes; k++)
      {
         /* ================================================================
	    Find min. cost link between: reached node ---> unreached node
            ================================================================ */
         x = y = 0;

         for ( i = 0; i < NNodes; i++ )
            for ( j = 0; j < NNodes; j++ )
            {
                if ( Reached[i] && !Reached[j] &&
                     LinkCost[i][j] < LinkCost[x][y] )
                {
		   x = i;
		   y = j;
                }
            }

         System.out.println("(" + 
				+ x + "," + 
				+ y + ")" +
				" = " + LinkCost[x][y]);

         /* =================================
	    Add e (x,y) to Spanning tree
            ================================= */
         predNode[y] = x;          // Record the min cost link

	 /* ==========================================
	    ReachSet = ReachSet union {y}
	    UnReachSet = UnReachSet - {y}
	    ========================================== */
         Reached[y] = true;

         printReachSet( Reached );     // Print state....
         System.out.print("");
      }

      printMinCostEdges( predNode );
   }

   void printMinCostEdges( int[] a )
   {
      for ( int i = 1; i < NNodes; i++ )
           System.out.print("");
          //System.out.println( a[i] + " --> " + i );
   }

   void printReachSet(boolean[] Reached )
   {
    //  System.out.print("ReachSet = ");
     // for (int i = 0; i < Reached.length; i++ )
     //    if ( Reached[i] )
     //      System.out.print( i + " ");
      System.out.print("");
   }

}

