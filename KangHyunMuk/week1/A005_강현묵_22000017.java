import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String skill = br.readLine();
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        int count =0;

        for (String skill_tree : skill_trees) {
            int index = 0;
            for (int j = 0; j < skill_tree.length(); j++) {
                if (skill.contains(Character.toString(skill_tree.charAt(j))))
                    if (skill.charAt(index) == skill_tree.charAt(j))
                        index++;
                    else {
                        index = -1;
                        break;
                    }

            }
            if (index != -1)
                count++;

        }
        bw.write(Integer.toString(count));
        br.close();
        bw.flush();
        bw.close();
    }
}
