#include<iostream>
using namespace std;
class angkapositifdannegatif;
int main()
{
 char pilih;
do {int bil;
cout << " Taruh Angka : ";
cin >> bil;

if (bil == 0) {
cout << "100";
}
else  if ( bil > 0){
if (bil % 2 == 0) {
cout << "Positif ganjil "<<endl;
}
else{
cout << "Positif genap"<<endl;
}
}
else{
if (bil % 2 == -1) {
cout << " Negatif ganjil" <<endl;
}
else{
cout << " Negatif genap" <<endl;
}
}
 cout << " ulang ? (ya/tidak)" <<endl;
    cin >> pilih;
    cout << endl;
 }while (pilih =='ya' , 'YA');


}
