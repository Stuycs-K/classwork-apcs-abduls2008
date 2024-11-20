import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public boolean isValidRoom(String name, String checksum){


  int[] letcount = new int[26];
  for (char c: name.toCharArray[]){
    letcount[c-'a']++
  }
}

  for (int i=0; i< checksum.length(); i++){
    char current = checksum.charAt(i);
    for (int j = i + 1; j<checksum.length(); j++){
      char next = checksum.charAt[i];
      if (letcount[next - 'a'] > letcount[current - 'a'] || (letcount[next-'a'] == letcount[current - 'a'] && next < current))
    }

  }
  return false;
}
}
return true;
}
