/*
 * Copyright 2008-Present Kevin Moye <moyekj@yahoo.com>.
 *
 * This file is part of kmttg package.
 *
 * kmttg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this project.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.tivo.kmttg.gui.comparator;

import java.util.Comparator;

// Strip off leading price before regular string sort applied
// "($1.99) Rizzoli & Isles [Ep 703] - Cops vs. Zombies"
public class StringShowComparator implements Comparator<String> {
   public int compare(String o1, String o2) {
      if (o1 != null && o2 != null) {
         o1 = o1.replaceFirst("^\\(.+\\)\\s+", "");
         o1 = o1.replaceFirst("^\\s*", "");
         o2 = o2.replaceFirst("^\\(.+\\)\\s+", "");
         o2 = o2.replaceFirst("^\\s*", "");
         return o1.compareTo(o2);
      }
      return 0;
   }
}

