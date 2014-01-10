TransferGuardWsClient
=====================

# TransferGuardConsoleApplication
PAML TransferGuard Web Service Sample Java Console Application

This sample demonstrates how use the PAML TransferGuard Web Service to send laboratory orders and receive results.  You must be a Pathology Associates Medical Laboratories, LLC (PAML) client or 
approved vendor to access the TransferGuard Web Services.  Visit http://www.paml.com/ for more information.

# Getting Started
1. Git the code from https://github.com/PAML/TransferGuardWsClient
2. Import your TransferGuard client certificate
   * Double-click the .p12 certificate you received from PAML
   * Enter the password for the certificate
   * Select the option to 'Automatically select the certificate store based on the type of certificate'
   * Allow the PAML TrasnferGuard Certificate Authority to be installed
3. Open the project in Eclipse
4. Change SiteId to the site ID provided by PAML and included in your certificate
5. Right click on the TransferGuardServiceClient class and "Run As -> Java Application"
6. Check out the sample order and result messages at http://paml.github.io/SampleMessages.html

# Need Help?
Support and other information is available at https://github.com/PAML/.
