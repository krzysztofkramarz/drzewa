package com.github.wojtechm.drzewa.zadanie_pierwsze;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/**
 * @author Makiela Wojciech
 */
class PrzeszukiwanieWszerz
{
   List<Integer> wartości = new ArrayList<>();
   Queue<Węzeł> węzły = new LinkedList<>();

   String czytajDrzewo(Węzeł korzeń)
   {

      węzły.add(korzeń);
      while (!węzły.isEmpty())
      {
         korzeń = węzły.element();
         dodajDzieci(korzeń);
         wartości.add(Objects.requireNonNull(węzły.poll()).wartość);
      }

      return wartości.toString();

   }

   private void dodajDzieci(Węzeł korzeń)
   {
      if (korzeń.lewy != null)
      {
         węzły.add(korzeń.lewy);
      }
      if (korzeń.prawy != null)
      {
         węzły.add(korzeń.prawy);
      }
   }

}
