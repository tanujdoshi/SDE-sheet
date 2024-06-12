class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(list);

        if (numRows > 1) {
            List<Integer> new_list = new ArrayList<>();
            new_list.add(1);
            new_list.add(1);
            finalList.add(new_list);
        }

        if (numRows > 2) {
            for (int i = 2; i < numRows; i++) {
                List<Integer> generate_list = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        generate_list.add(1);
                    } else {
                        // System.out.println(finalList.get(i-1).get(0));
                        int sum = finalList.get(i - 1).get(j - 1) + finalList.get(i - 1).get(j);
                        generate_list.add(sum);
                    }
                }
                finalList.add(generate_list);
            }
        }

        return finalList;
    }
}