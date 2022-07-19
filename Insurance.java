#include<iostream>
using namespace std;
class insurance
{
    int option1;
    int option3;
    int premium;
    int premium_total;
    int insuredvalue;
    int factor=0.1;
    int ncb;
    int GST;
    int claims;
    int option2;
     int timeperiod;


public:
    void select_insurance_type();
    void calculate_premium();
    void display_insurance();

};

void insurance::calculate_premium()
{

    cout<<"\n Enter the insured value";
    cin>>insuredvalue;
    cout<<"\n Enter the no claim bonus ";
    cin>>ncb;
    cout<<"\n Enter the GST value";
    cin>>GST;
    premium=(insuredvalue*factor);
    premium_total=premium+(ncb/100)+GST;
    cout<<"\n Your premium amount is "<<premium_total;

}
void insurance::select_insurance_type()
{

    cout<<"\n Select the insurance type";
    cout<<"\n 1.life insurance \n 2.Car insurance \n 3.Health insurance";
    cin>>option1;
    if(option1==1)
    {
      cout<<"\n You selected LIFE INSURANCE";
      cout<<"\n Enter your policy time (in Years) ";
      cin>>timeperiod;
      cout<<"\n Your insurance is approved \n Your time period is :"<<timeperiod;
      cout<<"\n if you want to check the premium press 1 or 0";
      cin>>option3;
      if(option3==1)
      {
          goto jump;
      }
      else
      {
          exit(1);
      }

    }
      if(option1==2)
    {
      cout<<"\n You selected CAR INSURANCE";
      cout<<"\n Enter your policy time (in Years) ";
      cin>>timeperiod;
       cout<<"\n Your insurance is approved \n Your time period is :"<<timeperiod;
         cout<<"\n if you want to check the premium press 1 or 0";
      cin>>option3;
      if(option3==1)
      {
          goto jump;
      }
      else
      {
          exit(1);
      }
    }
      if(option1==3)
    {
      cout<<"\n You selected LIFE INSURANCE";
      cout<<"\n Enter your policy time (in Years) ";
      cin>>timeperiod;
      cout<<"\n Your insurance is approved \n Your time period is :"<<timeperiod;
        cout<<"\n if you want to check the premium press 1 or 0";
      cin>>option3;
      if(option3==1)
      {
          goto jump;
      }
      else
      {
          exit(1);
      }

    }
}



int main()
{
    insurance obj;
      int choice;
    cout<<"\n Welcome to the insurance Company";
    cout<<"\n Select your option \n 1.Select the insurance type \n 2. calculate premium \n 3.exit";
    cin>>choice;
    switch(choice)
    {
        case 1: obj.select_insurance_type();
        break;
       
        case 2: obj.calculate_premium();
        break;
        case 3: exit(1);
        break;
        default:
            cout<<"\n Invalid Statement";
    }

}
