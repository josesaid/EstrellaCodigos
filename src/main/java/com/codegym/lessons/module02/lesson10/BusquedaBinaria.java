package com.codegym.lessons.module02.lesson10;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 8, 9, 10 };
        int target = 5;

        int index = binarySearch(nums, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }

    // Función para determinar si existe un `target` en la array ordenada `nums`
    // o no usar un algoritmo de búsqueda binaria
    public static int binarySearch(int[] nums, int target) {
        // el espacio de búsqueda es nums[left…right]
        int left = 0, right = nums.length - 1;

        // bucle hasta que se agote el espacio de búsqueda
        while (left <= right) {
            // encuentra el valor medio en el espacio de búsqueda y
            // lo compara con el objetivo

            int mid = (left + right) / 2;

            // puede ocurrir un desbordamiento. Usar:
            // int mid = left + (right - left) / 2;
            // int mid = right - (right - left) / 2;

            // se encuentra el objetivo
            if (target == nums[mid]) {
                return mid;
            }

            // descartar todos los elementos en el espacio de búsqueda correcto,
            // incluyendo el elemento del medio
            else if (target < nums[mid]) {
                right = mid - 1;
            }

            // descartar todos los elementos en el espacio de búsqueda de la izquierda,
            // incluyendo el elemento del medio
            else {
                left = mid + 1;
            }
        }

        // `target` no existe en la array
        return -1;
    }
}
