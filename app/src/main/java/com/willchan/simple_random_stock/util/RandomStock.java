package com.willchan.simple_random_stock.util;

import android.util.Log;

import java.util.Random;

public class RandomStock {
    private static final String TAG = "RandomStock";

    private static final String[] DOW30_STOCK_TICKER = new String[]{
            "MMM", "AXP", "AAPL", "BA", "CAT", "CVX", "CSCO",
            "KO", "DOW", "XOM", "GS", "HD", "INTC", "IBM", "JNJ",
            "JPM", "MCD", "MRK", "MSFT", "NKE", "PFE", "PG", "TRV", "UTX",
            "UNH", "VZ", "V", "WBA", "WMT", "DIS"
    };
    private static final String[] DOW30_STOCK_NAME = new String[]{
            "3M Co", "American Express Co", "Apple Inc", "Boeing Co",
            "Caterpillar Inc", "Chevron Corp", "Cisco Systems Inc",
            "Coca-Cola Co", "Dow Inc", "Exxon Mobil Corp", "Goldman Sachs Group Inc",
            "Home Depot Inc", "Intel Corp", "International Business Machines Corp",
            "Johnson & Johnson", "JPMorgan Chase & Co", "McDonald's Corp",
            "Merck & Co Inc", "Microsoft Corp", "Nike Inc", "Pfizer Inc", "Procter & Gamble Co",
            "Travelers Companies Inc", "United Technologies Corp", "UnitedHealth Group Inc",
            "Verizon Communications Inc", "Visa Inc", "Walgreens Boots Alliance Inc",
            "Walmart Inc", "Walt Disney Co"
    };
    private static final String[] SPY500_STOCK_TICKER = new String[]{
            "MMM",
            "AOS",
            "ABT",
            "ABBV",
            "ACN",
            "ATVI",
            "AYI",
            "ADBE",
            "AAP",
            "AMD",
            "AES",
            "AET",
            "AMG",
            "AFL",
            "A",
            "APD",
            "AKAM",
            "ALK",
            "ALB",
            "ARE",
            "ALXN",
            "ALGN",
            "ALLE",
            "AGN",
            "ADS",
            "LNT",
            "ALL",
            "GOOGL",
            "GOOG",
            "MO",
            "AMZN",
            "AEE",
            "AAL",
            "AEP",
            "AXP",
            "AIG",
            "AMT",
            "AWK",
            "AMP",
            "ABC",
            "AME",
            "AMGN",
            "APH",
            "APC",
            "ADI",
            "ANDV",
            "ANSS",
            "ANTM",
            "AON",
            "APA",
            "AIV",
            "AAPL",
            "AMAT",
            "APTV",
            "ADM",
            "ARNC",
            "AJG",
            "AIZ",
            "T",
            "ADSK",
            "ADP",
            "AZO",
            "AVB",
            "AVY",
            "BHGE",
            "BLL",
            "BAC",
            "BAX",
            "BBT",
            "BDX",
            "BRK.B",
            "BBY",
            "BIIB",
            "BLK",
            "HRB",
            "BA",
            "BWA",
            "BXP",
            "BSX",
            "BHF",
            "BMY",
            "AVGO",
            "BF.B",
            "CHRW",
            "CA",
            "COG",
            "CDNS",
            "CPB",
            "COF",
            "CAH",
            "KMX",
            "CCL",
            "CAT",
            "CBOE",
            "CBG",
            "CBS",
            "CELG",
            "CNC",
            "CNP",
            "CTL",
            "CERN",
            "CF",
            "SCHW",
            "CHTR",
            "CHK",
            "CVX",
            "CMG",
            "CB",
            "CHD",
            "CI",
            "XEC",
            "CINF",
            "CTAS",
            "CSCO",
            "C",
            "CFG",
            "CTXS",
            "CME",
            "CMS",
            "KO",
            "CTSH",
            "CL",
            "CMCSA",
            "CMA",
            "CAG",
            "CXO",
            "COP",
            "ED",
            "STZ",
            "GLW",
            "COST",
            "COTY",
            "CCI",
            "CSRA",
            "CSX",
            "CMI",
            "CVS",
            "DHI",
            "DHR",
            "DRI",
            "DVA",
            "DE",
            "DAL",
            "XRAY",
            "DVN",
            "DLR",
            "DFS",
            "DISCA",
            "DISCK",
            "DISH",
            "DG",
            "DLTR",
            "D",
            "DOV",
            "DWDP",
            "DPS",
            "DTE",
            "DUK",
            "DRE",
            "DXC",
            "ETFC",
            "EMN",
            "ETN",
            "EBAY",
            "ECL",
            "EIX",
            "EW",
            "EA",
            "EMR",
            "ETR",
            "EVHC",
            "EOG",
            "EQT",
            "EFX",
            "EQIX",
            "EQR",
            "ESS",
            "EL",
            "RE",
            "ES",
            "EXC",
            "EXPE",
            "EXPD",
            "ESRX",
            "EXR",
            "XOM",
            "FFIV",
            "FB",
            "FAST",
            "FRT",
            "FDX",
            "FIS",
            "FITB",
            "FE",
            "FISV",
            "FLIR",
            "FLS",
            "FLR",
            "FMC",
            "FL",
            "F",
            "FTV",
            "FBHS",
            "BEN",
            "FCX",
            "GPS",
            "GRMN",
            "IT",
            "GD",
            "GE",
            "GGP",
            "GIS",
            "GM",
            "GPC",
            "GILD",
            "GPN",
            "GS",
            "GT",
            "GWW",
            "HAL",
            "HBI",
            "HOG",
            "HRS",
            "HIG",
            "HAS",
            "HCA",
            "HCP",
            "HP",
            "HSIC",
            "HES",
            "HPE",
            "HLT",
            "HOLX",
            "HD",
            "HON",
            "HRL",
            "HST",
            "HPQ",
            "HUM",
            "HBAN",
            "HII",
            "IDXX",
            "INFO",
            "ITW",
            "ILMN",
            "INCY",
            "IR",
            "INTC",
            "ICE",
            "IBM",
            "IP",
            "IPG",
            "IFF",
            "INTU",
            "ISRG",
            "IVZ",
            "IQV",
            "IRM",
            "JBHT",
            "JEC",
            "SJM",
            "JNJ",
            "JCI",
            "JPM",
            "JNPR",
            "KSU",
            "K",
            "KEY",
            "KMB",
            "KIM",
            "KMI",
            "KLAC",
            "KSS",
            "KHC",
            "KR",
            "LB",
            "LLL",
            "LH",
            "LRCX",
            "LEG",
            "LEN",
            "LUK",
            "LLY",
            "LNC",
            "LKQ",
            "LMT",
            "L",
            "LOW",
            "LYB",
            "MTB",
            "MAC",
            "M",
            "MRO",
            "MPC",
            "MAR",
            "MMC",
            "MLM",
            "MAS",
            "MA",
            "MAT",
            "MKC",
            "MCD",
            "MCK",
            "MDT",
            "MRK",
            "MET",
            "MTD",
            "MGM",
            "KORS",
            "MCHP",
            "MU",
            "MSFT",
            "MAA",
            "MHK",
            "TAP",
            "MDLZ",
            "MON",
            "MNST",
            "MCO",
            "MS",
            "MSI",
            "MYL",
            "NDAQ",
            "NOV",
            "NAVI",
            "NTAP",
            "NFLX",
            "NWL",
            "NFX",
            "NEM",
            "NWSA",
            "NWS",
            "NEE",
            "NLSN",
            "NKE",
            "NI",
            "NBL",
            "JWN",
            "NSC",
            "NTRS",
            "NOC",
            "NCLH",
            "NRG",
            "NUE",
            "NVDA",
            "OXY",
            "OMC",
            "OKE",
            "ORCL",
            "ORLY",
            "PCAR",
            "PKG",
            "PH",
            "PDCO",
            "PAYX",
            "PYPL",
            "PNR",
            "PBCT",
            "PEP",
            "PKI",
            "PRGO",
            "PFE",
            "PCG",
            "PM",
            "PSX",
            "PNW",
            "PXD",
            "PNC",
            "RL",
            "PPG",
            "PPL",
            "PX",
            "PCLN",
            "PFG",
            "PG",
            "PGR",
            "PLD",
            "PRU",
            "PEG",
            "PSA",
            "PHM",
            "PVH",
            "QRVO",
            "QCOM",
            "PWR",
            "DGX",
            "RRC",
            "RJF",
            "RTN",
            "O",
            "RHT",
            "REG",
            "REGN",
            "RF",
            "RSG",
            "RMD",
            "RHI",
            "ROK",
            "COL",
            "ROP",
            "ROST",
            "RCL",
            "SPGI",
            "CRM",
            "SBAC",
            "SCG",
            "SLB",
            "SNI",
            "STX",
            "SEE",
            "SRE",
            "SHW",
            "SIG",
            "SPG",
            "SWKS",
            "SLG",
            "SNA",
            "SO",
            "LUV",
            "SWK",
            "SBUX",
            "STT",
            "SRCL",
            "SYK",
            "STI",
            "SYMC",
            "SYF",
            "SNPS",
            "SYY",
            "TROW",
            "TPR",
            "TGT",
            "TEL",
            "FTI",
            "TXN",
            "TXT",
            "BK",
            "CLX",
            "COO",
            "HSY",
            "MOS",
            "TRV",
            "DIS",
            "TMO",
            "TIF",
            "TWX",
            "TJX",
            "TMK",
            "TSS",
            "TSCO",
            "TDG",
            "TRIP",
            "FOXA",
            "FOX",
            "TSN",
            "USB",
            "UDR",
            "ULTA",
            "UAA",
            "UA",
            "UNP",
            "UAL",
            "UNH",
            "UPS",
            "URI",
            "UTX",
            "UHS",
            "UNM",
            "VFC",
            "VLO",
            "VAR",
            "VTR",
            "VRSN",
            "VRSK",
            "VZ",
            "VRTX",
            "VIAB",
            "V",
            "VNO",
            "VMC",
            "WBA",
            "WMT",
            "WM",
            "WAT",
            "WEC",
            "WFC",
            "HCN",
            "WDC",
            "WU",
            "WRK",
            "WY",
            "WHR",
            "WMB",
            "WLTW",
            "WYN",
            "WYNN",
            "XEL",
            "XRX",
            "XLNX",
            "XL",
            "XYL",
            "YUM",
            "ZBH",
            "ZION",
            "ZTS"
    };
    private static final String[] SPY500_STOCK_NAME = new String[]{
            "3M Company",
            "A.O. Smith Corp",
            "Abbott Laboratories",
            "AbbVie Inc.",
            "Accenture plc",
            "Activision Blizzard",
            "Acuity Brands Inc",
            "Adobe Systems Inc",
            "Advance Auto Parts",
            "Advanced Micro Devices Inc",
            "AES Corp",
            "Aetna Inc",
            "Affiliated Managers Group Inc",
            "AFLAC Inc",
            "Agilent Technologies Inc",
            "Air Products & Chemicals Inc",
            "Akamai Technologies Inc",
            "Alaska Air Group Inc",
            "Albemarle Corp",
            "Alexandria Real Estate Equities Inc",
            "Alexion Pharmaceuticals",
            "Align Technology",
            "Allegion",
            "Allergan, Plc",
            "Alliance Data Systems",
            "Alliant Energy Corp",
            "Allstate Corp",
            "Alphabet Inc Class A",
            "Alphabet Inc Class C",
            "Altria Group Inc",
            "Amazon.com Inc",
            "Ameren Corp",
            "American Airlines Group",
            "American Electric Power",
            "American Express Co",
            "American International Group, Inc.",
            "American Tower Corp A",
            "American Water Works Company Inc",
            "Ameriprise Financial",
            "AmerisourceBergen Corp",
            "AMETEK Inc",
            "Amgen Inc",
            "Amphenol Corp",
            "Anadarko Petroleum Corp",
            "Analog Devices, Inc.",
            "Andeavor",
            "ANSYS",
            "Anthem Inc.",
            "Aon plc",
            "Apache Corporation",
            "Apartment Investment & Management",
            "Apple Inc.",
            "Applied Materials Inc",
            "Aptiv Plc",
            "Archer-Daniels-Midland Co",
            "Arconic Inc",
            "Arthur J. Gallagher & Co.",
            "Assurant Inc",
            "AT&T Inc",
            "Autodesk Inc",
            "Automatic Data Processing",
            "AutoZone Inc",
            "AvalonBay Communities, Inc.",
            "Avery Dennison Corp",
            "Baker Hughes, a GE Company",
            "Ball Corp",
            "Bank of America Corp",
            "Baxter International Inc.",
            "BB&T Corporation",
            "Becton Dickinson",
            "Berkshire Hathaway",
            "Best Buy Co. Inc.",
            "Biogen Inc.",
            "BlackRock",
            "Block H&R",
            "Boeing Company",
            "BorgWarner",
            "Boston Properties",
            "Boston Scientific",
            "Brighthouse Financial Inc",
            "Bristol-Myers Squibb",
            "Broadcom",
            "Brown-Forman Corp.",
            "C. H. Robinson Worldwide",
            "CA, Inc.",
            "Cabot Oil & Gas",
            "Cadence Design Systems",
            "Campbell Soup",
            "Capital One Financial",
            "Cardinal Health Inc.",
            "Carmax Inc",
            "Carnival Corp.",
            "Caterpillar Inc.",
            "CBOE Holdings",
            "CBRE Group",
            "CBS Corp.",
            "Celgene Corp.",
            "Centene Corporation",
            "CenterPoint Energy",
            "CenturyLink Inc",
            "Cerner",
            "CF Industries Holdings Inc",
            "Charles Schwab Corporation",
            "Charter Communications",
            "Chesapeake Energy",
            "Chevron Corp.",
            "Chipotle Mexican Grill",
            "Chubb Limited",
            "Church & Dwight",
            "CIGNA Corp.",
            "Cimarex Energy",
            "Cincinnati Financial",
            "Cintas Corporation",
            "Cisco Systems",
            "Citigroup Inc.",
            "Citizens Financial Group",
            "Citrix Systems",
            "CME Group Inc.",
            "CMS Energy",
            "Coca-Cola Company (The)",
            "Cognizant Technology Solutions",
            "Colgate-Palmolive",
            "Comcast Corp.",
            "Comerica Inc.",
            "Conagra Brands",
            "Concho Resources",
            "ConocoPhillips",
            "Consolidated Edison",
            "Constellation Brands",
            "Corning Inc.",
            "Costco Wholesale Corp.",
            "Coty, Inc",
            "Crown Castle International Corp.",
            "CSRA Inc.",
            "CSX Corp.",
            "Cummins Inc.",
            "CVS Health",
            "D. R. Horton",
            "Danaher Corp.",
            "Darden Restaurants",
            "DaVita Inc.",
            "Deere & Co.",
            "Delta Air Lines Inc.",
            "Dentsply Sirona",
            "Devon Energy Corp.",
            "Digital Realty Trust Inc",
            "Discover Financial Services",
            "Discovery Communications-A",
            "Discovery Communications-C",
            "Dish Network",
            "Dollar General",
            "Dollar Tree",
            "Dominion Energy",
            "Dover Corp.",
            "DowDuPont",
            "Dr Pepper Snapple Group",
            "DTE Energy Co.",
            "Duke Energy",
            "Duke Realty Corp",
            "DXC Technology",
            "E*Trade",
            "Eastman Chemical",
            "Eaton Corporation",
            "eBay Inc.",
            "Ecolab Inc.",
            "Edison Int'l",
            "Edwards Lifesciences",
            "Electronic Arts",
            "Emerson Electric Company",
            "Entergy Corp.",
            "Envision Healthcare",
            "EOG Resources",
            "EQT Corporation",
            "Equifax Inc.",
            "Equinix",
            "Equity Residential",
            "Essex Property Trust, Inc.",
            "Estee Lauder Cos.",
            "Everest Re Group Ltd.",
            "Eversource Energy",
            "Exelon Corp.",
            "Expedia Inc.",
            "Expeditors International",
            "Express Scripts",
            "Extra Space Storage",
            "Exxon Mobil Corp.",
            "F5 Networks",
            "Facebook, Inc.",
            "Fastenal Co",
            "Federal Realty Investment Trust",
            "FedEx Corporation",
            "Fidelity National Information Services",
            "Fifth Third Bancorp",
            "FirstEnergy Corp",
            "Fiserv Inc",
            "FLIR Systems",
            "Flowserve Corporation",
            "Fluor Corp.",
            "FMC Corporation",
            "Foot Locker Inc",
            "Ford Motor",
            "Fortive Corp",
            "Fortune Brands Home & Security",
            "Franklin Resources",
            "Freeport-McMoRan Inc.",
            "Gap Inc.",
            "Garmin Ltd.",
            "Gartner Inc",
            "General Dynamics",
            "General Electric",
            "General Growth Properties Inc.",
            "General Mills",
            "General Motors",
            "Genuine Parts",
            "Gilead Sciences",
            "Global Payments Inc.",
            "Goldman Sachs Group",
            "Goodyear Tire & Rubber",
            "Grainger (W.W.) Inc.",
            "Halliburton Co.",
            "Hanesbrands Inc",
            "Harley-Davidson",
            "Harris Corporation",
            "Hartford Financial Svc.Gp.",
            "Hasbro Inc.",
            "HCA Holdings",
            "HCP Inc.",
            "Helmerich & Payne",
            "Henry Schein",
            "Hess Corporation",
            "Hewlett Packard Enterprise",
            "Hilton Worldwide Holdings Inc",
            "Hologic",
            "Home Depot",
            "Honeywell Int'l Inc.",
            "Hormel Foods Corp.",
            "Host Hotels & Resorts",
            "HP Inc.",
            "Humana Inc.",
            "Huntington Bancshares",
            "Huntington Ingalls Industries",
            "IDEXX Laboratories",
            "IHS Markit Ltd.",
            "Illinois Tool Works",
            "Illumina Inc",
            "Incyte",
            "Ingersoll-Rand PLC",
            "Intel Corp.",
            "Intercontinental Exchange",
            "International Business Machines",
            "International Paper",
            "Interpublic Group",
            "Intl Flavors & Fragrances",
            "Intuit Inc.",
            "Intuitive Surgical Inc.",
            "Invesco Ltd.",
            "IQVIA Holdings Inc.",
            "Iron Mountain Incorporated",
            "J. B. Hunt Transport Services",
            "Jacobs Engineering Group",
            "JM Smucker",
            "Johnson & Johnson",
            "Johnson Controls International",
            "JPMorgan Chase & Co.",
            "Juniper Networks",
            "Kansas City Southern",
            "Kellogg Co.",
            "KeyCorp",
            "Kimberly-Clark",
            "Kimco Realty",
            "Kinder Morgan",
            "KLA-Tencor Corp.",
            "Kohl's Corp.",
            "Kraft Heinz Co",
            "Kroger Co.",
            "L Brands Inc.",
            "L-3 Communications Holdings",
            "Laboratory Corp. of America Holding",
            "Lam Research",
            "Leggett & Platt",
            "Lennar Corp.",
            "Leucadia National Corp.",
            "Lilly (Eli) & Co.",
            "Lincoln National",
            "LKQ Corporation",
            "Lockheed Martin Corp.",
            "Loews Corp.",
            "Lowe's Cos.",
            "LyondellBasell",
            "M&T Bank Corp.",
            "Macerich",
            "Macy's Inc.",
            "Marathon Oil Corp.",
            "Marathon Petroleum",
            "Marriott Int'l.",
            "Marsh & McLennan",
            "Martin Marietta Materials",
            "Masco Corp.",
            "Mastercard Inc.",
            "Mattel Inc.",
            "McCormick & Co.",
            "McDonald's Corp.",
            "McKesson Corp.",
            "Medtronic plc",
            "Merck & Co.",
            "MetLife Inc.",
            "Mettler Toledo",
            "MGM Resorts International",
            "Michael Kors Holdings",
            "Microchip Technology",
            "Micron Technology",
            "Microsoft Corp.",
            "Mid-America Apartments",
            "Mohawk Industries",
            "Molson Coors Brewing Company",
            "Mondelez International",
            "Monsanto Co.",
            "Monster Beverage",
            "Moody's Corp",
            "Morgan Stanley",
            "Motorola Solutions Inc.",
            "Mylan N.V.",
            "Nasdaq, Inc.",
            "National Oilwell Varco Inc.",
            "Navient",
            "NetApp",
            "Netflix Inc.",
            "Newell Brands",
            "Newfield Exploration Co",
            "Newmont Mining Corporation",
            "News Corp. Class A",
            "News Corp. Class B",
            "NextEra Energy",
            "Nielsen Holdings",
            "Nike",
            "NiSource Inc.",
            "Noble Energy Inc",
            "Nordstrom",
            "Norfolk Southern Corp.",
            "Northern Trust Corp.",
            "Northrop Grumman Corp.",
            "Norwegian Cruise Line",
            "NRG Energy",
            "Nucor Corp.",
            "Nvidia Corporation",
            "Occidental Petroleum",
            "Omnicom Group",
            "ONEOK",
            "Oracle Corp.",
            "O'Reilly Automotive",
            "PACCAR Inc.",
            "Packaging Corporation of America",
            "Parker-Hannifin",
            "Patterson Companies",
            "Paychex Inc.",
            "PayPal",
            "Pentair Ltd.",
            "People's United Financial",
            "PepsiCo Inc.",
            "PerkinElmer",
            "Perrigo",
            "Pfizer Inc.",
            "PG&E Corp.",
            "Philip Morris International",
            "Phillips 66",
            "Pinnacle West Capital",
            "Pioneer Natural Resources",
            "PNC Financial Services",
            "Polo Ralph Lauren Corp.",
            "PPG Industries",
            "PPL Corp.",
            "Praxair Inc.",
            "Priceline.com Inc",
            "Principal Financial Group",
            "Procter & Gamble",
            "Progressive Corp.",
            "Prologis",
            "Prudential Financial",
            "Public Serv. Enterprise Inc.",
            "Public Storage",
            "Pulte Homes Inc.",
            "PVH Corp.",
            "Qorvo",
            "QUALCOMM Inc.",
            "Quanta Services Inc.",
            "Quest Diagnostics",
            "Range Resources Corp.",
            "Raymond James Financial Inc.",
            "Raytheon Co.",
            "Realty Income Corporation",
            "Red Hat Inc.",
            "Regency Centers Corporation",
            "Regeneron",
            "Regions Financial Corp.",
            "Republic Services Inc",
            "ResMed",
            "Robert Half International",
            "Rockwell Automation Inc.",
            "Rockwell Collins",
            "Roper Technologies",
            "Ross Stores",
            "Royal Caribbean Cruises Ltd",
            "S&P Global, Inc.",
            "Salesforce.com",
            "SBA Communications",
            "SCANA Corp",
            "Schlumberger Ltd.",
            "Scripps Networks Interactive Inc.",
            "Seagate Technology",
            "Sealed Air",
            "Sempra Energy",
            "Sherwin-Williams",
            "Signet Jewelers",
            "Simon Property Group Inc",
            "Skyworks Solutions",
            "SL Green Realty",
            "Snap-On Inc.",
            "Southern Co.",
            "Southwest Airlines",
            "Stanley Black & Decker",
            "Starbucks Corp.",
            "State Street Corp.",
            "Stericycle Inc",
            "Stryker Corp.",
            "SunTrust Banks",
            "Symantec Corp.",
            "Synchrony Financial",
            "Synopsys Inc.",
            "Sysco Corp.",
            "T. Rowe Price Group",
            "Tapestry, Inc.",
            "Target Corp.",
            "TE Connectivity Ltd.",
            "TechnipFMC",
            "Texas Instruments",
            "Textron Inc.",
            "The Bank of New York Mellon Corp.",
            "The Clorox Company",
            "The Cooper Companies",
            "The Hershey Company",
            "The Mosaic Company",
            "The Travelers Companies Inc.",
            "The Walt Disney Company",
            "Thermo Fisher Scientific",
            "Tiffany & Co.",
            "Time Warner Inc.",
            "TJX Companies Inc.",
            "Torchmark Corp.",
            "Total System Services",
            "Tractor Supply Company",
            "TransDigm Group",
            "TripAdvisor",
            "Twenty-First Century Fox Class A",
            "Twenty-First Century Fox Class B",
            "Tyson Foods",
            "U.S. Bancorp",
            "UDR Inc",
            "Ulta Salon Cosmetics & Fragrance Inc",
            "Under Armour Class A",
            "Under Armour Class C",
            "Union Pacific",
            "United Continental Holdings",
            "United Health Group Inc.",
            "United Parcel Service",
            "United Rentals, Inc.",
            "United Technologies",
            "Universal Health Services, Inc.",
            "Unum Group",
            "V.F. Corp.",
            "Valero Energy",
            "Varian Medical Systems",
            "Ventas Inc",
            "Verisign Inc.",
            "Verisk Analytics",
            "Verizon Communications",
            "Vertex Pharmaceuticals Inc",
            "Viacom Inc.",
            "Visa Inc.",
            "Vornado Realty Trust",
            "Vulcan Materials",
            "Walgreens Boots Alliance",
            "Wal-Mart Stores",
            "Waste Management Inc.",
            "Waters Corporation",
            "Wec Energy Group Inc",
            "Wells Fargo",
            "Welltower Inc.",
            "Western Digital",
            "Western Union Co",
            "WestRock Company",
            "Weyerhaeuser Corp.",
            "Whirlpool Corp.",
            "Williams Cos.",
            "Willis Towers Watson",
            "Wyndham Worldwide",
            "Wynn Resorts Ltd",
            "Xcel Energy Inc",
            "Xerox Corp.",
            "Xilinx Inc",
            "XL Capital",
            "Xylem Inc.",
            "Yum! Brands Inc",
            "Zimmer Biomet Holdings",
            "Zions Bancorp",
            "Zoetis"
    };
    private static final String[] NASDAQ100_STOCK_TICKER = new String[]{
            "FOXA",
            "FOX",
            "ATVI",
            "ADBE",
            "AKAM",
            "ALXN",
            "ALGN",
            "GOOGL",
            "GOOG",
            "AMZN",
            "AAL",
            "AMGN",
            "ADI",
            "AAPL",
            "AMAT",
            "ADSK",
            "ADP",
            "BIDU",
            "BIIB",
            "BMRN",
            "AVGO",
            "CA",
            "CELG",
            "CERN",
            "CHTR",
            "CHKP",
            "CTAS",
            "CSCO",
            "CTXS",
            "CTSH",
            "CMCSA",
            "COST",
            "CSX",
            "CTRP",
            "XRAY",
            "DISCA",
            "DISCK",
            "DISH",
            "DLTR",
            "EBAY",
            "EA",
            "EXPE",
            "ESRX",
            "FB",
            "FAST",
            "FISV",
            "GILD",
            "HAS",
            "HSIC",
            "HOLX",
            "IDXX",
            "ILMN",
            "INCY",
            "INTC",
            "INTU",
            "ISRG",
            "JBHT",
            "JD",
            "KLAC",
            "KHC",
            "LRCX",
            "LBTYK",
            "LBTYA",
            "QVCA",
            "LILA",
            "LILAK",
            "MAR",
            "MAT",
            "MXIM",
            "MELI",
            "MCHP",
            "MU",
            "MSFT",
            "MDLZ",
            "MNST",
            "MYL",
            "NTES",
            "NFLX",
            "NCLH",
            "NVDA",
            "ORLY",
            "PCAR",
            "PAYX",
            "PYPL",
            "QCOM",
            "REGN",
            "ROST",
            "STX",
            "SHPG",
            "SIRI",
            "SWKS",
            "SBUX",
            "SYMC",
            "TSLA",
            "TXN",
            "PCLN",
            "TMUS",
            "TSCO",
            "ULTA",
            "VRSK",
            "VRTX",
            "VIAB",
            "VOD",
            "WBA",
            "WDC",
            "WYNN",
            "XLNX"
    };
    private static final String[] NASDAQ100_STOCK_NAME = new String[]{
            "21st Century Fox Class A",
            "21st Century Fox Class B",
            "Activision Blizzard Inc",
            "Adobe Systems Inc",
            "Akamai Technologies Inc",
            "Alexion Pharmaceuticals Inc",
            "Align Technology Inc",
            "Alphabet Class A",
            "Alphabet Class C",
            "Amazon.com Inc",
            "American Airlines Group Inc",
            "Amgen Inc",
            "Analog Devices Inc",
            "Apple Inc",
            "Applied Materials Inc",
            "Autodesk Inc",
            "Automatic Data Processing Inc",
            "Baidu Inc",
            "Biogen Inc",
            "Biomarin Pharmaceutical Inc",
            "Broadcom Ltd",
            "CA Inc",
            "Celgene Corp",
            "Cerner Corp",
            "Charter Communications Inc",
            "Check Point Software Technologies Ltd",
            "Cintas Corp",
            "Cisco Systems Inc",
            "Citrix Systems Inc",
            "Cognizant Technology Solutions Corp",
            "Comcast Corp",
            "Costco Wholesale Corp",
            "CSX Corp",
            "Ctrip.Com International Ltd",
            "Dentsply Sirona Inc",
            "Discovery Communications Inc",
            "Discovery Communications Inc",
            "DISH Network Corp",
            "Dollar Tree Inc",
            "eBay Inc",
            "Electronic Arts",
            "Expedia Inc",
            "Express Scripts Holding Co",
            "Facebook",
            "Fastenal Co",
            "Fiserv Inc",
            "Gilead Sciences Inc",
            "Hasbro Inc",
            "Henry Schein Inc",
            "Hologic Inc",
            "IDEXX Laboratories Inc",
            "Illumina Inc",
            "Incyte Corp",
            "Intel Corp",
            "Intuit Inc",
            "Intuitive Surgical Inc",
            "J.B. Hunt Transport Services Inc",
            "JD.com Inc",
            "KLA-Tencor Corp",
            "Kraft Heinz Co",
            "Lam Research Corp",
            "Liberty Global PLC",
            "Liberty Global PLC",
            "Liberty Interactive Corp",
            "Liberty Latin America Ltd",
            "Liberty Latin America Ltd",
            "Marriott International Inc",
            "Mattel Inc",
            "Maxim Integrated Products Inc",
            "MercadoLibre Inc",
            "Microchip Technology Inc",
            "Micron Technology Inc",
            "Microsoft Corp",
            "Mondelez International Inc",
            "Monster Beverage Corp",
            "Mylan NV",
            "NetEase Inc",
            "Netflix Inc",
            "Norwegian Cruise Line Holdings Ltd",
            "NVIDIA Corp",
            "O'Reilly Automotive Inc",
            "PACCAR Inc",
            "Paychex Inc",
            "PayPal Holdings Inc",
            "Qualcomm Inc",
            "Regeneron Pharmaceuticals Inc",
            "Ross Stores Inc",
            "Seagate Technology PLC",
            "Shire PLC",
            "Sirius XM Holdings Inc",
            "Skyworks Solutions Inc",
            "Starbucks Corp",
            "Symantec Corp",
            "Tesla Inc",
            "Texas Instruments Inc",
            "The Priceline Group",
            "T-Mobile US Inc",
            "Tractor Supply Co",
            "Ulta Beauty Inc",
            "Verisk Analytics Inc",
            "Vertex Pharmaceuticals Inc",
            "Viacom Inc",
            "Vodafone Group PLC",
            "Walgreens Boots Alliance Inc",
            "Western Digital Corp",
            "Wynn Resorts Ltd",
            "Xilinx Inc"
    };

    public static String[] getDow30StockTicker() {
        return DOW30_STOCK_TICKER;
    }

    public static String[] getDow30StockName() {
        return DOW30_STOCK_NAME;
    }

    public static String[] getSpy500StockTicker() {
        return SPY500_STOCK_TICKER;
    }

    public static String[] getSpy500StockName() {
        return SPY500_STOCK_NAME;
    }

    public static String[] getNasdaq100StockTicker() {
        return NASDAQ100_STOCK_TICKER;
    }

    public static String[] getNasdaq100StockName() {
        return NASDAQ100_STOCK_NAME;
    }

    public static int getRandomStockPosition(StockIndex stockIndex) {
        int position = -1;
        if (stockIndex == StockIndex.DOW) {
            position = new Random().nextInt(DOW30_STOCK_TICKER.length);
//            String ticker = DOW30_STOCK_TICKER[position];
//            String name = DOW30_STOCK_NAME[position];
//            System.out.println("Name " + name + " and Ticker: " + ticker);
        } else if (stockIndex == StockIndex.SPY) {
            position = new Random().nextInt(SPY500_STOCK_TICKER.length);
//            String ticker = SPY500_STOCK_TICKER[position];
//            String name = SPY500_STOCK_NAME[position];
//            System.out.println("Name " + name + " and Ticker: " + ticker);
        } else if (stockIndex == StockIndex.NASDAQ) {
            position = new Random().nextInt(NASDAQ100_STOCK_TICKER.length);
//            String ticker = NASDAQ100_STOCK_TICKER[position];
//            String name = NASDAQ100_STOCK_NAME[position];
//            System.out.println("Name " + name + " and Ticker: " + ticker);
        } else {
            Log.e(TAG, "Maybe there's a new ENUM declared?");
        }
        return position;
    }

    public enum StockIndex {
        DOW, SPY, NASDAQ
    }
}
