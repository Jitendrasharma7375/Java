#include <iostream>
#include <string>
using namespace std;

struct Faculty
 {
    string faculty_name;
    int faculty_ID;
    string subject_codes;
    string class_names;
};

int getMaxID(Faculty arr[], int n) 
{
    int max = arr[0].faculty_ID;
    for (int i = 1; i < n; i++) 
    {
        if (arr[i].faculty_ID > max) 
        {
            max = arr[i].faculty_ID;
        }
    }
    return max;
}

void countSort(Faculty arr[], int n, int exp, int& swapCount) 
{
    Faculty* output = new Faculty[n];
    int i, count[10] = { 0 };

    for (i = 0; i < n; i++) 
    {
        count[(arr[i].faculty_ID / exp) % 10]++;
    }

    for (i = 1; i < 10; i++) 
    {
        count[i] += count[i - 1];
    }

    for (i = n - 1; i >= 0; i--) 
    {
        output[count[(arr[i].faculty_ID / exp) % 10] - 1] = arr[i];
        count[(arr[i].faculty_ID / exp) % 10]--;
    }

    for (i = 0; i < n; i++) 
    {
        if (output[i].faculty_ID != arr[i].faculty_ID) 
        {
            swapCount++;
        }
        arr[i] = output[i];
    }

    delete[] output;
}

void radixSort(Faculty arr[], int n, int& swapCount) 
{
    int max = getMaxID(arr, n);

    for (int exp = 1; max / exp > 0; exp *= 10) 
    {
        countSort(arr, n, exp, swapCount);
    }
}

int main() 
{
    Faculty faculties[5] = 
    {
        {"DR.Hariharasitaraman", 102, "SC1", "ClassA"},
        {"DR.Kanchan", 104, "SC2", "ClassB"},
        {"DR.Rizwan", 101, "SC3", "ClassC"},
        {"DR.Feeroz", 103, "SC4", "ClassD"},
        {"DR.Chandrama", 100, "SC5", "ClassE"}
    };

    int n = 5;
    int swapCount = 0;

    radixSort(faculties, n, swapCount);

    for (int i = 0; i < n; i++) 
    {
        cout << "Faculty Name: " << faculties[i].faculty_name << ", Faculty ID: " << faculties[i].faculty_ID
             << ", Subject Codes: " << faculties[i].subject_codes << ", Class Names: " << faculties[i].class_names << endl;
    }

    cout << "Number of swaps performed: " << swapCount << endl;

    return 0;
}
