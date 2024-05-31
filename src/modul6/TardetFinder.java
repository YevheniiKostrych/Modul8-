package modul6;

import java.util.Arrays;
class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets){
        if (aiCoords == null || targets == null || targets.length == 0) {
            // Перевірка на нульові аргументи або порожній масив targets
            throw new IllegalArgumentException("Invalid arguments");
        }
        int[] nearestTarget = targets[0];
        double minDistance = distance(aiCoords, nearestTarget);

        for (int i = 1; i < targets.length; i++) {
            double currentDistance = distance(aiCoords, targets[i]);
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                nearestTarget = targets[i];
            }
        }

        return nearestTarget;

    }
    private double distance(int[] point1, int[] point2) {
        int deltaX = point2[0] - point1[0];
        int deltaY = point2[1] - point1[1];
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }}
class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}