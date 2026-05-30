class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes,
                (a, b) -> b[1] - a[1]);

        int units = 0;

        for (int[] box : boxTypes) {

            int boxes = box[0];
            int unitsPerBox = box[1];

            int take = Math.min(boxes, truckSize);

            units += take * unitsPerBox;

            truckSize -= take;

            if (truckSize == 0) {
                break;
            }
        }

        return units;
    }
}