package com.custom.util;

import com.custom.utils.Algorithm.EditDistance;
import com.custom.utils.Company.CompanyCode;
import com.custom.utils.CompanyRecognize;
import com.custom.utils.NameLike;
import com.custom.utils.ParsePosition;
import com.custom.utils.PhoneStandard;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.hadoop.io.Text;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
//        assertTrue( true );
    }
    public void testEditDistance()  {
        int dis = EditDistance.GetEditDistance("ababab", "caababab");
        System.out.println(dis);
        //System.out.println("??");
    }

    public void testNameLikeVal() {
        NameLike n = new NameLike();
        String s1 = "Aaron Zhu Director";
        String s2 = "Aaron what thu Director";
        String sep = "?!-+*()\\|";
        int dis = n.NameLikeVal(s1, s2, sep);
        System.out.println(dis);
        dis = n.NameLikeVal(s1, s2, sep);
        System.out.println(dis);
    }
    public void testCompanyType() {
        System.out.println(CompanyCode.Code.valueOf("CO").ordinal());

    }
    public void testCompany() {
        String[] names = {
                "Allied Esports Entertainment, Inc.",
                "American Renal Associates Holdings, Inc.",
                "Stoddard Hill Media Holdings, LLC",
                "MPC Hudson LLC",
                "Makena Developed Markets Master Fund B, L.P.",
                "Daeg Partners, L.P.",
                "Tekne Capital Management, LLC",
                "Gemridge Technologies Inc",
                "PCCP CAPITAL II, L.P.",
                "Medical Engineering Innovations, Inc.",
                "ESPORTSUNITED LLC",
                "REDBACK NETWORKS INC",
                "RND Capital Systematic Alpha Fund, LP",
                "Tyson Prepared Foods, Inc.",
                "South Florida Secure Fund, LLC",
                "PACIFIC NORTHWEST HOLDING Co LLC",
                "Cambridge Rockwall MOB II, Ltd.",
                "ASAP Environmental Inc.",
                "EXTRAORDINARIES, INC.",
                "CRC Single Investor Fund XII, LP",
                "Prellis Biologics, Inc",
                "CREDIT SUISSE REAL ESTATE SECURITIES CORE FUND L P",
                "Natures Sunshine Products Inc",
                "FAST MODEL TECHNOLOGIES, LLC",
                "ADEN SOLUTIONS INC.",
                "Bulletproof Brands Co Inc",
                "China Skyrise Digital Service Inc.",
                "ULTRA URANIUM CORP /FI",
                "CHG HOLDINGS, INC.",
                "Bering Growth CORP",
                "MORNINGSIDE PARK CLO, LTD"
        };
        CompanyRecognize crz = new CompanyRecognize();
        for (String name : names) {
            System.out.println(name + " || " + crz.evaluate(new Text(name)).toString());
        }
    }
    public void testPhone() {
        String[] sList = new String[] {
            "(86) 10-64827328",
            "415-632-5700",
            "(949) 225-2600",
            "852-2121-3888",
            "(501) 978-2265",
            "(888) 405-9335",
            "(775) 858-8080",
            "6468549996",
            "608-215-2426",
            "212-902-1000",
            "(212) 829-5833",
            "302-338-9130",
            "345-949-7055",
            "617-233-8934",
            "8585461561",
            "716-636-0401",
            "972-789-3500",
            "6288002380",
            "(610) 977-3100",
            "1-833-785-5737",
            "678-932-2500",
            "212-687-1899",
            "5099958451",
            "(801) 580-0107",
            "(713) 240-9011",
            "5017498906",
            "202-841-7205",
            "972-395-1133",
            "713-539-4206",
            "347-866-3833",
            "916-794-5468",
            "210-490-4910",
            "530-885-6695",
            "512-796-6985",
            "313-378-1588",
            "414-745-5109",
            "7194889956",
            "7194889956",
            "212-287-4900",
            "(312) 475-9300",
            "843-579-9400",
            "8772904443",
            "516-662-1386",
            "2039057801",
            "707-525-1300",
            "952-224-4339",
            "706-237-6100",
            "8433380750",
            "3108504724",
            "2392542500",
            "415-297-1362",
            "817-919-1120",
            "310-201-4100",
            "415-937-7763",
            "501-320-4880",
            "203-717-1620",
            "314-446-3304",
            "617-650-6236",
            "(650) 400-5268",
            "(212) 810-4001",
            "(800) 908-7065",
            "8182533200",
            "(480) 894-6311",
            "(480) 894-6311",
            "4808946311",
            "4808946311",
            "4808946311",
            "(480) 894-6311",
            "(480) 894-6311",
            "4808946311",
            "(480) 894-6311",
            "4808946311",
            "484-530-4800",
            "(414) 777-1200",
            "(818) 386-1401",
            "011-44-1481-742400",
            "61 2 8232 3333",
            "702-932-4914",
            "303-919-4171",
            "4243305787",
            "852 2168 0849",
            "210-227-1010",
            "203-742-3600",
            "5122121160",
            "8777235477",
            "4107725232",
            "303-514-2793",
            "3524661113914",
            "303-829-3228",
            "857-254-1751",
            "212.218.6765",
            "212.218.6765",
            "212.218.6765",
            "405-285-4134",
            "2126524344",
            "2126524344",
            "2126524344",
            "2126524344",
            "305-948-3535",
            "800-267-4560",
        };
        for (String s: sList) {
            System.out.println(PhoneStandard.Standard(s));
        }
    }
    public void testPosition() {
        String[] titles = new String[] {
            "Chief Product Officer and Executive Vice President, Software",
            "Executive Vice President and Chief Facilities Services Officer",
            "Executive Vice President and Chief Technology Officer",
            "Executive Vice President, Product Development",
            "Executive Vice President, General Counsel and Corporate Secretary",
            "Interim Chief Financial Officer",
            "Chief Technology Officer",
            "Co-Chief Executive Officer, Co-President and Director",
            "Director and Chief Executive Officer",
            "Chairman of the Board, President and Chief Executive Officer",
            "Chief Executive Officer and Director",
            "Vice President, Process Development",
            "Executive Vice President, General Counsel, Corporate Secretary and Chief Compliance Officer",
            "Executive Chairman of the Board and Chief Executive Officer",
            "President, Director and Chief Executive Officer",
            "Senior Vice President, Comptroller and Principal Accounting Officer",
            "Executive Vice President and Principal Accounting Officer; Chief Financial Officer of the Company an",
            "Senior Vice President, General Counsel and Secretary",
            "Executive Vice President and General Counsel",
            "Director, President and Chief Executive Officer",
            "Investor Relations and Director",
            "Chief Sales Officer",
            "Chief Financial Officer",
            "Chief Investment Officer and Chief Operating Officer",
            "Chief Financial Officer and Principal Accounting Officer",
            "General Manager of ASE Japan and Wuxi Tongzhi",
            "Senior Vice President, Finance and Chief Financial Officer",
            "Commercial Director",
            "Senior Vice President and Chief People Officer",
            "Executive Vice President, General Counsel and Secretary",
            "Acting Senior Vice President of American States Utility Services, Inc.",
            "Chief Executive Officer and Chairman of the Board",
            "Chief Operations Officer and Chief Technology Officer",
            "Regional Executive, BancFirst",
            "Vice President",
            "Executive Vice President, Wood Products",
            "Chief Accounting Officer and Vice President, Accounting",
            "Chief Financial Officer, Executive Vice President and Chief Administrative Officer",
            "Chairman of the Board, President and Chief Executive Officer",
            "Chief Revenue Officer",
            "Senior Vice President, Research and Development and Chief Scientific Officer",
            "Senior Vice President, Utility Operations",
            "Director, President and Chief Operating Officer",
            "Technology Manager",
            "Group Head, International Banking and Digital Transformation",
            "Vice-President, Sales",
            "Corporate Vice President and Chief Human Resources Officer",
            "General Counsel",
            "Executive Vice President and President, Rhythm Management",
            "Chief Financial Officer of the Company and Busey Bank",
            "Principal Accounting Officer",
            "Chief Information Officer",
            "President of The Cheesecake Factory Bakery Incorporated",
            "Principal Accounting Officer, Vice President and Controller",
            "Vice Chairman of the Board of the Company and the Bank",
            "Chief Financial Officer",
            "General Counsel & Company Secretary",
            "Chief Financial Officer and Treasurer",
            "Chief Financial Officer and Principal Accounting Officer",
            "Vice President of Marketing, Television and Content",
            "General Counsel and Corporate Secretary of the Company and the Bank",
            "Chief Operating Officer of Canopy Rivers Corporation",
            "Executive Vice President; Chief Executive Officer of Vitas",
            "President, Intimates Group",
            "Vice President of Internal Audit",
            "Senior Vice President and Chief Financial Officer",
            "Chief Financial Officer and Principal Accounting Officer",
            "Chief Financial Officer, Principal Accounting Officer and Secretary",
            "Senior Vice President, Products",
            "Executive Vice President, Corporate Marketing and President, Westwood One",
            "Chairman of the Board and Chief Executive Officer",
            "Senior Vice President, Exploration",
            "Chief Financial Officer",
            "Director, President and Chief Executive Officer",
            "Director and Chief Executive Officer",
            "Director, Executive Vice President and Chief Commercial Officer",
            "Director and Vice President",
            "Chief Operating Officer",
            "Executive Chairman of the Board, NoJo",
            "President, Global Field Operations",
            "Chief Executive Officer and Chairman of the Board",
            "Executive Vice President and Chief Merchandising Officer",
            "Chairman of the Board and Chief Executive Officer",
            "Director, Fresh Operations",
            "Vice President and Chief Financial Officer",
            "Director, Executive Vice President of Finance, Chief Financial Officer, Chief Operating Officer and ",
            "Executive Vice President",
            "Chief Strategy Officer",
            "Chief Product Officer",
            "Executive Vice President and Chief Information Officer",
            "Chief Executive Officer, Global Direct-To-Consumer",
            "Senior Vice President, Human Resources, Retail Store Operations and Contact Center Operations",
            "Senior Vice President, Human Resources, Data and Procurement",
            "President, Digirad Imaging Solutions",
            "Director, Interim Chief Financial Officer, Chief Strategy Officer, Treasurer and Secretary",
            "Executive Vice President, Quality and Regulatory Affairs",
            "Independent Director",
            "Vice-President of Refining and Industrial Processes",
            "Executive Vice President, General Counsel and Secretary",
            "Executive Vice President and Chief Financial Officer",
            "Senior Vice President and Chief Commercial Officer",
            "Senior Vice President and Chief Marketing Officer",
            "President, Chief Executive Officer and Director",
            "Executive Vice President, Finance and Treasurer",
            "Senior Vice President, Chief Financial Officer, Principal Accounting Officer and Treasurer",
            "Director, Chief Executive Officer and President",
            "Executive Vice President, Geological and Geophysical",
            "Chief Executive Officer",
            "Executive Vice President and Chief Operating Officer",
            "Vice President, Commercial Transformation",
            "Senior Vice President and Chief Financial Officer",
            "President, Cabinets",
            "Director; President and Chief Executive Officer of the Company and the Bank",
            "Executive Vice President and Chief Marketing and Communications Officer",
            "Executive Vice President, Commercial Real Estate Lending",
            "Executive Vice President of Sales, Services, and Marketing",
            "Vice President, Human Resources",
            "Executive Vice President, Project Support Services",
            "Chief Executive Officer and Chairman of the Management Board",
            "Chief Legal Officer and Corporate Secretary",
            "President and Chief Operating Officer of the Bank",
            "Chief Product and Strategy Officer",
            "President",
            "Chief Operating Officer",
            "Executive Vice President and Chief Administrative Officer of Company and Bank",
            "President, Chief Executive Officer, and Director",
            "Executive Vice President and Chief Project Engineer",
            "Chief Accounting Officer and Controller",
            "Principal Accounting Officer, Chief Financial Officer and Director",
            "Senior Vice President, Business and Corporate Development",
            "Senior Vice President, Pharmaceutical Sciences and Manufacturing",
            "Executive Vice President, Sales and Merchandising",
            "Vice President, Operations Mexico & Peru",
            "Chief Executive Officer of GyM",
            "Chairman of the Board and Chief Operating Officer",
            "Executive Vice President and Chief Operating Officer",
            "Vice President, Corporate Controller and Principal Accounting Officer",
            "Senior Vice President, General Counsel, Corporate Secretary and Chief Compliance Officer",
            "Principal Accounting Officer; Treasurer, Executive Vice President and Chief Financial Officer of the",
            "Vice President, General Counsel and Corporate Secretary",
            "Senior Vice President, Chief Financial Officer and Chief Accounting Officer",
            "Senior Vice President of Accounting and Finance",
            "General Counsel and Secretary",
            "Chairman of the Board, Chief Executive Officer and President; Chairman of the Board and Chief Execut",
            "Vice President and Chief Strategy Officer",
            "Chief Financial Officer",
            "Vice President, Manufacturing and Supply",
            "Executive Vice President and Chief Credit Officer, Heritage Bank of Commerce",
            "Chairman of the Board and Chief Executive Officer",
            "Principal Accounting Officer, Vice President, Chief Financial Officer and Treasurer",
            "Corporate Vice President and President, International",
            "Executive Vice President and Chief of Business Operations",
            "Vice President, Managed Care and Payer Relations",
            "Chief Executive Officer, IGI UK",
            "Director and President",
            "General Counsel and Secretary",
            "Chief Medical Officer",
            "Principal Accounting Officer, Chief Financial Officer and Corporate Secretary",
            "Senior Vice President, Enterprise Operational Excellence",
            "Executive Vice President and General Manager, Data Centers",
            "Executive Vice President and Chief Medical Officer",
            "Executive Vice President",
            "Senior Vice President, Technical Operations",
            "Executive Vice President, General Counsel and Corporate Secretary",
            "Global Chief Executive Officer, Capital Markets",
            "Senior Vice President and Chief Accounting Officer",
            "Head of Pension Business Division",
            "General Counsel and Secretary",
            "Vice President, General Counsel and Corporate Secretary",
            "Executive Vice President, Chief Actuary and Strategic Analytics Officer",
            "Senior Vice President, Chief Information and Integrated Services Officer",
            "President and Chief Executive Officer",
            "Senior Executive Vice President, Ethics Office",
            "Chief Executive Officer and Director",
            "Executive Vice President and Chief Financial Officer",
            "Director, President and Chief Executive Officer",
            "Chief Financial Officer, Principal Accounting Officer and Treasurer",
            "Head of Global Operations and R&D",
            "Chief Financial Officer and Principal Accounting Officer",
            "Senior Vice President, Quality",
            "Vice President, Product Development",
            "Director and Chief Executive Officer",
            "Chief Marketing Officer",
            "Chief Exploration Officer",
            "Executive Vice President, Chief Legal Officer and Secretary",
            "Vice President, Finance, Chief Financial Officer and Member of the Management Board",
            "President, Moody's Analytics",
            "Vice Chairman of the Board, President and Chief Operating Officer",
            "Chairman of the Board and Chief Executive Officer",
            "Executive Vice President and Chief Financial Officer",
            "President, Chief Executive Officer and Director",
            "General Counsel and Secretary",
            "General Counsel and Secretary",
            "Group Chairman of the Board and Group Chief Executive Officer",
            "Chief Scientific Officer",
            "Director, President and Chief Executive Officer",
            "Senior Vice President, Supply Chain Management, Valve and Technical Product Sales",
            "Senior Vice President, Finance and Chief Accounting Officer",
            "Director, President and Chief Executive Officer",
            "Executive Vice President, Sales and Business Development of MGIC",
            "Senior Vice President, Business Development",
            "General Counsel",
            "Chief Commercial Officer",
            "Executive Vice President, General Counsel and Corporate Secretary",
            "Executive Vice President",
            "Executive Chairman of the Board and Chief Executive Officer",
            "Chief Financial Officer and Principal Accounting Officer",
            "Chairman of the Board and Chief Executive Officer",
            "Chief Legal Risk Officer",
            "Executive Vice President, Chief Financial Officer and Principal Accounting Officer",
            "Director, President and Chief Executive Officer",
            "Chief Executive Officer and Chairman of the Board",
            "Executive Vice President and Chief Financial Officer",
            "Vice President",
            "Senior Executive Vice President and Chief Innovation Officer",
            "Executive Vice President and Chief Communications Officer",
            "President, Roofing",
            "Vice Chairman of the Board, President and Chief Executive Officer; Vice Chairman of the Board, Presi",
            "Vice President, tax and risk",
            "Executive Vice President and Chief Human Resources Officer",
            "Chief Operating Officer",
            "Chairman of the Board and Chief Executive Officer",
            "Senior Vice President and Chief Procurement Officer",
            "Chairman of the Board and Chief Executive Officer",
            "Senior Vice President, Operations",
            "Director, President and Chief Executive Officer",
            "Chairman of the Board of the Company and Prosperity Bank; Chief Operating Officer of Prosperity Bank",
            "Executive Vice President and Chief Financial Officer",
            "Executive Vice President, Midwest Region",
            "Senior Vice President and Chief Accounting Officer",
            "Principal Accounting Officer; Chief Financial Officer and Treasurer",
            "Vice President of Corporate Development and Commercial Strategy",
            "Chief Financial Officer",
            "Secretary and Chief Legal Officer",
            "Chief Underwriting Officer",
            "President, Eastern Europe Region",
            "Vice President, Corporate Secretary and Chief Legal Officer",
            "President, Chief Executive Officer and Chairman of the Board",
            "Executive Vice President and Chief Customer Officer",
            "Executive Vice President and Chief Financial Officer of Company and The Prudential Insurance Company",
            "Co-Chief Executive Officer, Chief Financial Officer and Director",
            "Chief Financial Officer",
            "President, Chief Executive Officer and Director",
            "Director, President and Chief Executive Officer",
            "Chief Executive Officer",
            "Director; Senior Vice President of Republic Bank and Trust Company",
            "Vice President, Preclinical Development",
            "Director, President and Chief Executive Officer",
            "Chief Financial Officer",
            "Chief Financial Officer and Executive Vice President",
            "Director, President and Chief Executive Officer",
            "Senior Vice President, Chief Legal Officer and Secretary",
            "Corporate Controller and Chief Accounting Officer",
            "Chief Financial Officer and Principal Accounting Officer",
            "Chief Commercial Officer",
            "Senior Vice President, Human Resources",
            "Vice President, Safety and Human Resources",
            "Director, President and Chief Executive Officer",
            "Director, President and Chief Executive Officer",
            "Chief Operating Officer and Senior Vice President",
            "President and Chief Executive Officer",
            "Vice President and General Manager, Global Commercial Operations",
            "Chairman of the Board, President and Chief Executive Officer",
            "Senior Vice President Engineering and Operations",
            "Chief Financial Officer, Senior Vice President, Principal Accounting Officer and Treasurer",
            "Chairman of the Board, President and Chief Executive Officer",
            "Chief Financial Officer and Principal Accounting Officer",
            "Vice President, Clinical and Regulatory Affairs",
            "Director, Group Chief Risk Officer and Senior Managing Corporate Executive Officer",
            "Chairman of the Board, President and Chief Executive Officer",
            "Chief Financial Officer and Secretary",
            "Executive Vice President, Chief Financial Officer, and Treasurer of Gulf Power",
            "Chairman of the Board, Chief Executive Officer and President",
            "Senior Vice President, Boeing Programs",
            "Executive Vice President and Chief Financial Officer",
            "Chief Financial Officer and Principal Accounting Officer",
            "Senior Vice President, Commercial Operations, North America and APAC",
            "President, Chief Executive Officer and Director",
            "Chief Innovation Officer",
            "Chief Lending Officer, South Texas Region of Spirit of Texas Bank",
            "Executive Officer, Forestry Business Unit",
            "Senior Vice President, Clinical Research and Development",
            "Director, President and Chief Executive Officer",
            "Chief Operating Officer",
            "Principal Accounting Officer; Senior Vice President, Chief Financial Officer and Treasurer of the Co",
            "Vice-President, Taxation",
            "Chief Technology Officer",
            "Chief Financial Officer",
            "Director and Secretary",
            "Chief Branch Banking Officer for the Bank and Human Resources Director",
            "Chief Executive Officer and Director",
            "Head of EMEA Marketing",
            "Executive Vice President, Manufacturing, Supply Chain and Information Technology",
            "President and CEO of Building and Specialty Contractors Groups",
            "Senior Vice President",
            "Head of Investments and Group Chief Investment Officer",
            "Executive Vice President, Strategic Development and President, International",
            "Chief Technology Officer",
            "Senior Vice President, General Counsel, Corporate Secretary and Chief Risk Officer",
            "Vice President and Head of Fund Development",
            "Ternium Argentina President",
            "Chief Accounting Officer and Corporate Controller",
            "Director and Chief Executive Officer",
            "Chairman of the Board and Chief Executive Officer of the Company and UHS and President",
            "Chief Human Resource Officer",
            "Senior Vice President and Chief Transformation Officer",
            "Regional Vice President and General Manager - U.S. Concrete - East",
            "Director, Chief Administrative Officer and Chief Information Officer",
            "Chairman of the Board, Chief Executive Officer and President",
            "Group Chief Technology Officer",
            "President, Technology",
            "Chairman of the Board and Executive Vice President",
            "Chairman of the Board and Chief Executive Officer",
            "Executive Director,Chief Financial Officer",
            "Vice President and President, Viasat Commercial Networks",
            "Principal Accounting Officer and Principal Financial Officer",
            "Chief Executive Officer, Westpac New Zealand Limited",
            "Senior Vice President, Distribution; President, Ivy Distributors, Inc.",
            "Deputy President",
            "Executive Vice President and Chief Growth and Experience Officer",
            "Senior Vice President and Chief Financial Officer",
            "President",
            "Executive Vice President and Chief Internal Auditor",
            "Executive Vice President and Head of M&A of WM Capital",
            "President, International",
            "President, Chief Financial Officer, Corporate Secretary and Principal Accounting Officer",
            "Senior Vice President, Corporate Development",
            "Senior Vice President, Sales",
            "Non-Executive Officer",
            "Executive Vice President, General Counsel and Co-Secretary",
            "Executive Chairman of the Board and Chief Executive Officer",
        };
        for (String title : titles) {
            System.out.printf("ori:  %s  new : %s\n", title, String.join("|", ParsePosition.GetPosition(title)));
        }
    }
}

