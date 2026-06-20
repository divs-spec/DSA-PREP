class Solution {
  public boolean canConvertString(String s, String t, int k) {
    if (s.length() != t.length())
      return false;
    int[] shiftCount = new int[26];

    for (int i = 0; i < s.length(); ++i)
      ++shiftCount[(t.charAt(i) - s.charAt(i) + 26) % 26];

    for (int shift = 1; shift < 26; ++shift)
      if (shift + 26 * (shiftCount[shift] - 1) > k)
        return false;

    return true;
  }
}
