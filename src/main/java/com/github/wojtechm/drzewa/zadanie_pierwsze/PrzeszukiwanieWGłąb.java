package com.github.wojtechm.drzewa.zadanie_pierwsze;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Makiela Wojciech
 */
class PrzeszukiwanieWGłąb
{

   List<Integer> wartości = new ArrayList<>();

   String czytajDrzewo(Węzeł korzeń)
   {
      wartości.add(korzeń.wartość);
      if (korzeń.lewy != null)
      {
         czytajDrzewo(korzeń.lewy);
      }

      if (korzeń.prawy != null)
      {
         czytajDrzewo(korzeń.prawy);
      }
      return wartości.toString();
   }
}
