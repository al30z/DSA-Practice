public int[] findPermutation(String s) {
            int[] result = new int[s.length() + 1];
            for (int i = 0; i <= s.length(); i++) {
                result[i] = i + 1;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'D') {
                    int left = i;
                    while (i < s.length() && s.charAt(i) == 'D') {
                        i++;
                    }
                    reverse(result, left, i);
                }
            }
            return result;
        }

        private void reverse(int[] result, int left, int i) {
            while (left < i) {
                int temp = result[left];
                result[left] = result[i];
                result[i] = temp;
                left++;
                i--;
            }
        }
    }
}
