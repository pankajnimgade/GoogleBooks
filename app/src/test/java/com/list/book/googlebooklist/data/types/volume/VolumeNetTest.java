package com.list.book.googlebooklist.data.types.volume;

import com.google.gson.Gson;

import org.junit.Test;

public class VolumeNetTest {

    private static final Gson GSON = new Gson();

    @Test
    public void testParsingVolume() {
        System.out.println("testParsingVolume");

        VolumeResponse volumeResponse = GSON.fromJson(TestData.test_data, VolumeResponse.class);

        System.out.println(volumeResponse.getKind());
        System.out.println(volumeResponse.getTotalItems());
        System.out.println(volumeResponse.getItems().size());

        System.out.println();

        for (Volume volume : volumeResponse.getItems()) {
            System.out.println("\n------------------------------------\n");

            System.out.println(volume.getEtag());
            System.out.println(volume.getId());
            System.out.println(volume.getKind());
            System.out.println(volume.getSelfLink());

            VolumeInfo volumeInfo = volume.getVolumeInfo();

            System.out.println(volumeInfo.getTitle());
            System.out.println(volumeInfo.getSubtitle());
            System.out.println("Author: "+volumeInfo.getAuthors()[0]);
            System.out.println(volumeInfo.getCanonicalVolumeLink());
            System.out.println(volumeInfo.getContentVersion());
            System.out.println(volumeInfo.getDescription());
            System.out.println(volumeInfo.getInfoLink());
            System.out.println(volumeInfo.getLanguage());
            System.out.println(volumeInfo.getPageCount());
            System.out.println(volumeInfo.getPrintType());
            System.out.println(volumeInfo.getPreviewLink());

            SaleInfo saleInfo = volume.getSaleInfo();

            System.out.println(saleInfo.getBuyLink());
            System.out.println(saleInfo.getCountry());
            System.out.println(saleInfo.getSaleability());

            if (saleInfo.getListPrice() != null) {

                System.out.println(saleInfo.getListPrice().getAmount());
                System.out.println(saleInfo.getListPrice().getCurrencyCode());
            }



        }

    }

   private class TestData{
        private static final String test_data = "{\n" +
                "    \"kind\": \"books#volumes\",\n" +
                "    \"totalItems\": 3045,\n" +
                "    \"items\": [\n" +
                "        {\n" +
                "            \"kind\": \"books#volume\",\n" +
                "            \"id\": \"r8aRl6gvkz8C\",\n" +
                "            \"etag\": \"8cL25PGBS6A\",\n" +
                "            \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/r8aRl6gvkz8C\",\n" +
                "            \"volumeInfo\": {\n" +
                "                \"title\": \"Sherlock Holmes in the Hound of the Baskervilles\",\n" +
                "                \"subtitle\": \"A Sounds Primer\",\n" +
                "                \"authors\": [\n" +
                "                    \"Jennifer Adams\"\n" +
                "                ],\n" +
                "                \"publisher\": \"Gibbs Smith\",\n" +
                "                \"publishedDate\": \"2013\",\n" +
                "                \"description\": \"Introduces sound using characters, places, and events from Arthur Conan Doyle's \\\"The Hound of the Baskervilles.\\\"\",\n" +
                "                \"industryIdentifiers\": [\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_13\",\n" +
                "                        \"identifier\": \"9781423634119\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_10\",\n" +
                "                        \"identifier\": \"142363411X\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"readingModes\": {\n" +
                "                    \"text\": false,\n" +
                "                    \"image\": true\n" +
                "                },\n" +
                "                \"pageCount\": 22,\n" +
                "                \"printType\": \"BOOK\",\n" +
                "                \"categories\": [\n" +
                "                    \"Juvenile Nonfiction\"\n" +
                "                ],\n" +
                "                \"averageRating\": 4.5,\n" +
                "                \"ratingsCount\": 2,\n" +
                "                \"maturityRating\": \"NOT_MATURE\",\n" +
                "                \"allowAnonLogging\": false,\n" +
                "                \"contentVersion\": \"preview-1.0.0\",\n" +
                "                \"imageLinks\": {\n" +
                "                    \"smallThumbnail\": \"http://books.google.com/books/content?id=r8aRl6gvkz8C&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "                    \"thumbnail\": \"http://books.google.com/books/content?id=r8aRl6gvkz8C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "                },\n" +
                "                \"language\": \"en\",\n" +
                "                \"previewLink\": \"http://books.google.com/books?id=r8aRl6gvkz8C&printsec=frontcover&dq=Sherlock+Holmes&hl=&cd=2&source=gbs_api\",\n" +
                "                \"infoLink\": \"http://books.google.com/books?id=r8aRl6gvkz8C&dq=Sherlock+Holmes&hl=&source=gbs_api\",\n" +
                "                \"canonicalVolumeLink\": \"https://books.google.com/books/about/Sherlock_Holmes_in_the_Hound_of_the_Bask.html?hl=&id=r8aRl6gvkz8C\"\n" +
                "            },\n" +
                "            \"saleInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"saleability\": \"NOT_FOR_SALE\",\n" +
                "                \"isEbook\": false\n" +
                "            },\n" +
                "            \"accessInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"viewability\": \"PARTIAL\",\n" +
                "                \"embeddable\": true,\n" +
                "                \"publicDomain\": false,\n" +
                "                \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "                \"epub\": {\n" +
                "                    \"isAvailable\": false\n" +
                "                },\n" +
                "                \"pdf\": {\n" +
                "                    \"isAvailable\": false\n" +
                "                },\n" +
                "                \"webReaderLink\": \"http://play.google.com/books/reader?id=r8aRl6gvkz8C&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "                \"accessViewStatus\": \"SAMPLE\",\n" +
                "                \"quoteSharingAllowed\": false\n" +
                "            },\n" +
                "            \"searchInfo\": {\n" +
                "                \"textSnippet\": \"Introduces sound using characters, places, and events from Arthur Conan Doyle&#39;s &quot;The Hound of the Baskervilles.&quot;\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"kind\": \"books#volume\",\n" +
                "            \"id\": \"HGm0L3FxbWkC\",\n" +
                "            \"etag\": \"wGgJlYs+QaE\",\n" +
                "            \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/HGm0L3FxbWkC\",\n" +
                "            \"volumeInfo\": {\n" +
                "                \"title\": \"Sherlock Holmes\",\n" +
                "                \"subtitle\": \"The Hidden Years\",\n" +
                "                \"authors\": [\n" +
                "                    \"Michael Kurland\"\n" +
                "                ],\n" +
                "                \"publisher\": \"Minotaur Books\",\n" +
                "                \"publishedDate\": \"2006-01-24\",\n" +
                "                \"description\": \"In 1891, Sherlock Holmes in a struggle with his arch-enemy, the Napoleon of Crime, Professor James Moriarty, plunged with him over the Reichenbach Falls to his inevitable death. All of England - indeed the entire world - mourned the irreplaceable loss of the world's greatest detective. And that's where things stood until 1894 when Holmes suddenly reappeared in London, revealing himself to his friend Dr. John Watson, and resumed his activities as a consulting detective. Holmes remained very quiet and mysterious on those missing three years, never really revealing precisely where he'd been and what he'd done in the 'hidden years.\\\" Now, in this anthology of original stories the truth about those thirty-five months is unveiled and Holmes' adventures described. While some stories place Holmes in such familiar locations as New York and San Francisco, others find him high in the Himalayas or above the Arctic Circle. With stories from such writers as Rhys Bowen, Peter Beagle, Carolyn Wheat, Michael Collins and many others, Sherlock Holmes: The Hidden Years is a must-have book for every fan who has every wondered about the untold adventures of Sherlock Holmes.\",\n" +
                "                \"industryIdentifiers\": [\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_13\",\n" +
                "                        \"identifier\": \"9781466826137\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_10\",\n" +
                "                        \"identifier\": \"1466826134\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"readingModes\": {\n" +
                "                    \"text\": true,\n" +
                "                    \"image\": false\n" +
                "                },\n" +
                "                \"pageCount\": 400,\n" +
                "                \"printType\": \"BOOK\",\n" +
                "                \"categories\": [\n" +
                "                    \"Fiction\"\n" +
                "                ],\n" +
                "                \"maturityRating\": \"NOT_MATURE\",\n" +
                "                \"allowAnonLogging\": true,\n" +
                "                \"contentVersion\": \"0.2.1.0.preview.2\",\n" +
                "                \"imageLinks\": {\n" +
                "                    \"smallThumbnail\": \"http://books.google.com/books/content?id=HGm0L3FxbWkC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "                    \"thumbnail\": \"http://books.google.com/books/content?id=HGm0L3FxbWkC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "                },\n" +
                "                \"language\": \"en\",\n" +
                "                \"previewLink\": \"http://books.google.com/books?id=HGm0L3FxbWkC&printsec=frontcover&dq=Sherlock+Holmes&hl=&cd=3&source=gbs_api\",\n" +
                "                \"infoLink\": \"https://play.google.com/store/books/details?id=HGm0L3FxbWkC&source=gbs_api\",\n" +
                "                \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-HGm0L3FxbWkC\"\n" +
                "            },\n" +
                "            \"saleInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"saleability\": \"FOR_SALE\",\n" +
                "                \"isEbook\": true,\n" +
                "                \"listPrice\": {\n" +
                "                    \"amount\": 7.99,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"retailPrice\": {\n" +
                "                    \"amount\": 7.99,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"buyLink\": \"https://play.google.com/store/books/details?id=HGm0L3FxbWkC&rdid=book-HGm0L3FxbWkC&rdot=1&source=gbs_api\",\n" +
                "                \"offers\": [\n" +
                "                    {\n" +
                "                        \"finskyOfferType\": 1,\n" +
                "                        \"listPrice\": {\n" +
                "                            \"amountInMicros\": 7990000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"retailPrice\": {\n" +
                "                            \"amountInMicros\": 7990000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"giftable\": true\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"accessInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"viewability\": \"PARTIAL\",\n" +
                "                \"embeddable\": true,\n" +
                "                \"publicDomain\": false,\n" +
                "                \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "                \"epub\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/Sherlock_Holmes-sample-epub.acsm?id=HGm0L3FxbWkC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"pdf\": {\n" +
                "                    \"isAvailable\": false\n" +
                "                },\n" +
                "                \"webReaderLink\": \"http://play.google.com/books/reader?id=HGm0L3FxbWkC&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "                \"accessViewStatus\": \"SAMPLE\",\n" +
                "                \"quoteSharingAllowed\": false\n" +
                "            },\n" +
                "            \"searchInfo\": {\n" +
                "                \"textSnippet\": \"In 1891, Sherlock Holmes in a struggle with his arch-enemy, the Napoleon of Crime, Professor James Moriarty, plunged with him over the Reichenbach Falls to his inevitable death.\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"kind\": \"books#volume\",\n" +
                "            \"id\": \"RxAJAAAAIAAJ\",\n" +
                "            \"etag\": \"Elyv8WCXRUY\",\n" +
                "            \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/RxAJAAAAIAAJ\",\n" +
                "            \"volumeInfo\": {\n" +
                "                \"title\": \"Adventures of Sherlock Holmes\",\n" +
                "                \"authors\": [\n" +
                "                    \"Sir Arthur Conan Doyle\"\n" +
                "                ],\n" +
                "                \"publishedDate\": \"1900\",\n" +
                "                \"industryIdentifiers\": [\n" +
                "                    {\n" +
                "                        \"type\": \"OTHER\",\n" +
                "                        \"identifier\": \"STANFORD:24503524111\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"readingModes\": {\n" +
                "                    \"text\": true,\n" +
                "                    \"image\": true\n" +
                "                },\n" +
                "                \"pageCount\": 307,\n" +
                "                \"printType\": \"BOOK\",\n" +
                "                \"categories\": [\n" +
                "                    \"Detective and mystery stories, English\"\n" +
                "                ],\n" +
                "                \"averageRating\": 4,\n" +
                "                \"ratingsCount\": 123,\n" +
                "                \"maturityRating\": \"NOT_MATURE\",\n" +
                "                \"allowAnonLogging\": false,\n" +
                "                \"contentVersion\": \"0.1.5.0.full.3\",\n" +
                "                \"imageLinks\": {\n" +
                "                    \"smallThumbnail\": \"http://books.google.com/books/content?id=RxAJAAAAIAAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "                    \"thumbnail\": \"http://books.google.com/books/content?id=RxAJAAAAIAAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "                },\n" +
                "                \"language\": \"en\",\n" +
                "                \"previewLink\": \"http://books.google.com/books?id=RxAJAAAAIAAJ&pg=PP1&dq=Sherlock+Holmes&hl=&cd=4&source=gbs_api\",\n" +
                "                \"infoLink\": \"https://play.google.com/store/books/details?id=RxAJAAAAIAAJ&source=gbs_api\",\n" +
                "                \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-RxAJAAAAIAAJ\"\n" +
                "            },\n" +
                "            \"saleInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"saleability\": \"FREE\",\n" +
                "                \"isEbook\": true,\n" +
                "                \"buyLink\": \"https://play.google.com/store/books/details?id=RxAJAAAAIAAJ&rdid=book-RxAJAAAAIAAJ&rdot=1&source=gbs_api\"\n" +
                "            },\n" +
                "            \"accessInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"viewability\": \"ALL_PAGES\",\n" +
                "                \"embeddable\": true,\n" +
                "                \"publicDomain\": true,\n" +
                "                \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "                \"epub\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"downloadLink\": \"http://books.google.com/books/download/Adventures_of_Sherlock_Holmes.epub?id=RxAJAAAAIAAJ&hl=&output=epub&source=gbs_api\"\n" +
                "                },\n" +
                "                \"pdf\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"downloadLink\": \"http://books.google.com/books/download/Adventures_of_Sherlock_Holmes.pdf?id=RxAJAAAAIAAJ&hl=&output=pdf&sig=ACfU3U18ptZO2jaKLeRZWFQBCz9qz80jQA&source=gbs_api\"\n" +
                "                },\n" +
                "                \"webReaderLink\": \"http://play.google.com/books/reader?id=RxAJAAAAIAAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "                \"accessViewStatus\": \"FULL_PUBLIC_DOMAIN\",\n" +
                "                \"quoteSharingAllowed\": false\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"kind\": \"books#volume\",\n" +
                "            \"id\": \"uHzqRH1CtWQC\",\n" +
                "            \"etag\": \"4eN0zfLiUWo\",\n" +
                "            \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/uHzqRH1CtWQC\",\n" +
                "            \"volumeInfo\": {\n" +
                "                \"title\": \"The Case Book of Sherlock Holmes\",\n" +
                "                \"authors\": [\n" +
                "                    \"Arthur Conan Doyle\"\n" +
                "                ],\n" +
                "                \"publisher\": \"ReadHowYouWant.com\",\n" +
                "                \"publishedDate\": \"2009-03-14\",\n" +
                "                \"description\": \"In this collection of short stories a lot of different themes have been addressed. The usual mystery stories of Sherlock Holmes with great new twists and turns are bound to keep the reader captivated. Engrossing!\",\n" +
                "                \"industryIdentifiers\": [\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_13\",\n" +
                "                        \"identifier\": \"9781442942141\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_10\",\n" +
                "                        \"identifier\": \"1442942142\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"readingModes\": {\n" +
                "                    \"text\": true,\n" +
                "                    \"image\": true\n" +
                "                },\n" +
                "                \"printType\": \"BOOK\",\n" +
                "                \"categories\": [\n" +
                "                    \"Fiction\"\n" +
                "                ],\n" +
                "                \"averageRating\": 3.5,\n" +
                "                \"ratingsCount\": 15,\n" +
                "                \"maturityRating\": \"NOT_MATURE\",\n" +
                "                \"allowAnonLogging\": false,\n" +
                "                \"contentVersion\": \"2.7.4.0.preview.3\",\n" +
                "                \"imageLinks\": {\n" +
                "                    \"smallThumbnail\": \"http://books.google.com/books/content?id=uHzqRH1CtWQC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "                    \"thumbnail\": \"http://books.google.com/books/content?id=uHzqRH1CtWQC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "                },\n" +
                "                \"language\": \"en\",\n" +
                "                \"previewLink\": \"http://books.google.com/books?id=uHzqRH1CtWQC&printsec=frontcover&dq=Sherlock+Holmes&hl=&cd=5&source=gbs_api\",\n" +
                "                \"infoLink\": \"http://books.google.com/books?id=uHzqRH1CtWQC&dq=Sherlock+Holmes&hl=&source=gbs_api\",\n" +
                "                \"canonicalVolumeLink\": \"https://books.google.com/books/about/The_Case_Book_of_Sherlock_Holmes.html?hl=&id=uHzqRH1CtWQC\"\n" +
                "            },\n" +
                "            \"saleInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"saleability\": \"NOT_FOR_SALE\",\n" +
                "                \"isEbook\": false\n" +
                "            },\n" +
                "            \"accessInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"viewability\": \"PARTIAL\",\n" +
                "                \"embeddable\": true,\n" +
                "                \"publicDomain\": false,\n" +
                "                \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
                "                \"epub\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/The_Case_Book_of_Sherlock_Holmes-sample-epub.acsm?id=uHzqRH1CtWQC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"pdf\": {\n" +
                "                    \"isAvailable\": false\n" +
                "                },\n" +
                "                \"webReaderLink\": \"http://play.google.com/books/reader?id=uHzqRH1CtWQC&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "                \"accessViewStatus\": \"SAMPLE\",\n" +
                "                \"quoteSharingAllowed\": false\n" +
                "            },\n" +
                "            \"searchInfo\": {\n" +
                "                \"textSnippet\": \"The Case Book of Sherlock Holmes: This volume is the last collection of Sherlock Holmes stories. Doyle bids farewell to his most famous character in the preface.\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"kind\": \"books#volume\",\n" +
                "            \"id\": \"UomtUqgaJlkC\",\n" +
                "            \"etag\": \"PjWUAEs4N3Y\",\n" +
                "            \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/UomtUqgaJlkC\",\n" +
                "            \"volumeInfo\": {\n" +
                "                \"title\": \"The Best of Sherlock Holmes\",\n" +
                "                \"authors\": [\n" +
                "                    \"Arthur Conan Doyle\",\n" +
                "                    \"David Stuart Davies\",\n" +
                "                    \"Sidney Paget\"\n" +
                "                ],\n" +
                "                \"publisher\": \"Collector's Library\",\n" +
                "                \"publishedDate\": \"2009\",\n" +
                "                \"description\": \".0000000000These fifteen short stories, chosen by David Stuart Davies, former Editor of Sherlock magazine, show the master detective Sherlock Holmes at his most ingenious. Faithfully supported by his chronicler, Dr Watson, Holmes pits his wits against 'the Napoleon of Crime', Professor Moriarty, assists European royalty threatened by disgrace, helps to solve the mysterious death of a young woman due to be married, and becomes involved with other intrigues that defeat the detectives of Scotland Yard. The original illustrations from The Strand magazine by Sidney Paget accompany each story.\",\n" +
                "                \"industryIdentifiers\": [\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_10\",\n" +
                "                        \"identifier\": \"1905716559\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_13\",\n" +
                "                        \"identifier\": \"9781905716555\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"readingModes\": {\n" +
                "                    \"text\": false,\n" +
                "                    \"image\": true\n" +
                "                },\n" +
                "                \"pageCount\": 544,\n" +
                "                \"printType\": \"BOOK\",\n" +
                "                \"categories\": [\n" +
                "                    \"Fiction\"\n" +
                "                ],\n" +
                "                \"maturityRating\": \"NOT_MATURE\",\n" +
                "                \"allowAnonLogging\": false,\n" +
                "                \"contentVersion\": \"1.0.0.0.preview.1\",\n" +
                "                \"imageLinks\": {\n" +
                "                    \"smallThumbnail\": \"http://books.google.com/books/content?id=UomtUqgaJlkC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "                    \"thumbnail\": \"http://books.google.com/books/content?id=UomtUqgaJlkC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "                },\n" +
                "                \"language\": \"en\",\n" +
                "                \"previewLink\": \"http://books.google.com/books?id=UomtUqgaJlkC&printsec=frontcover&dq=Sherlock+Holmes&hl=&cd=6&source=gbs_api\",\n" +
                "                \"infoLink\": \"http://books.google.com/books?id=UomtUqgaJlkC&dq=Sherlock+Holmes&hl=&source=gbs_api\",\n" +
                "                \"canonicalVolumeLink\": \"https://books.google.com/books/about/The_Best_of_Sherlock_Holmes.html?hl=&id=UomtUqgaJlkC\"\n" +
                "            },\n" +
                "            \"saleInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"saleability\": \"NOT_FOR_SALE\",\n" +
                "                \"isEbook\": false\n" +
                "            },\n" +
                "            \"accessInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"viewability\": \"PARTIAL\",\n" +
                "                \"embeddable\": true,\n" +
                "                \"publicDomain\": false,\n" +
                "                \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "                \"epub\": {\n" +
                "                    \"isAvailable\": false\n" +
                "                },\n" +
                "                \"pdf\": {\n" +
                "                    \"isAvailable\": false\n" +
                "                },\n" +
                "                \"webReaderLink\": \"http://play.google.com/books/reader?id=UomtUqgaJlkC&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "                \"accessViewStatus\": \"SAMPLE\",\n" +
                "                \"quoteSharingAllowed\": false\n" +
                "            },\n" +
                "            \"searchInfo\": {\n" +
                "                \"textSnippet\": \"0000000000These fifteen short stories, chosen by David Stuart Davies, former Editor of Sherlock magazine, show the master detective Sherlock Holmes at his most ingenious.\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"kind\": \"books#volume\",\n" +
                "            \"id\": \"_hnMydl5ptQC\",\n" +
                "            \"etag\": \"nsCQip8B5vk\",\n" +
                "            \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/_hnMydl5ptQC\",\n" +
                "            \"volumeInfo\": {\n" +
                "                \"title\": \"Sherlock Holmes for the 21st Century\",\n" +
                "                \"subtitle\": \"Essays on New Adaptations\",\n" +
                "                \"authors\": [\n" +
                "                    \"Lynnette Porter\"\n" +
                "                ],\n" +
                "                \"publisher\": \"McFarland\",\n" +
                "                \"publishedDate\": \"2012-07-30\",\n" +
                "                \"description\": \"\\\"Holmes and Watson are more popular than ever. Adaptations describe him as tech savvy, scientifically detached, even psychologically aberrant; he has been romantically linked to The Woman and bromantically to Watson. These 14 essays analyze Sherlock Holmes as a cultural icon and explain why he is destined to be a beloved if controversial character for years to come\\\"--Provided by publisher.\",\n" +
                "                \"industryIdentifiers\": [\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_13\",\n" +
                "                        \"identifier\": \"9781476600574\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_10\",\n" +
                "                        \"identifier\": \"1476600570\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"readingModes\": {\n" +
                "                    \"text\": true,\n" +
                "                    \"image\": true\n" +
                "                },\n" +
                "                \"pageCount\": 220,\n" +
                "                \"printType\": \"BOOK\",\n" +
                "                \"categories\": [\n" +
                "                    \"Literary Criticism\"\n" +
                "                ],\n" +
                "                \"averageRating\": 3.5,\n" +
                "                \"ratingsCount\": 3,\n" +
                "                \"maturityRating\": \"NOT_MATURE\",\n" +
                "                \"allowAnonLogging\": true,\n" +
                "                \"contentVersion\": \"preview-1.0.0\",\n" +
                "                \"panelizationSummary\": {\n" +
                "                    \"containsEpubBubbles\": false,\n" +
                "                    \"containsImageBubbles\": false\n" +
                "                },\n" +
                "                \"imageLinks\": {\n" +
                "                    \"smallThumbnail\": \"http://books.google.com/books/content?id=_hnMydl5ptQC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "                    \"thumbnail\": \"http://books.google.com/books/content?id=_hnMydl5ptQC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "                },\n" +
                "                \"language\": \"en\",\n" +
                "                \"previewLink\": \"http://books.google.com/books?id=_hnMydl5ptQC&printsec=frontcover&dq=Sherlock+Holmes&hl=&cd=7&source=gbs_api\",\n" +
                "                \"infoLink\": \"https://play.google.com/store/books/details?id=_hnMydl5ptQC&source=gbs_api\",\n" +
                "                \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-_hnMydl5ptQC\"\n" +
                "            },\n" +
                "            \"saleInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"saleability\": \"FOR_SALE\",\n" +
                "                \"isEbook\": true,\n" +
                "                \"listPrice\": {\n" +
                "                    \"amount\": 15.99,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"retailPrice\": {\n" +
                "                    \"amount\": 9.99,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"buyLink\": \"https://play.google.com/store/books/details?id=_hnMydl5ptQC&rdid=book-_hnMydl5ptQC&rdot=1&source=gbs_api\",\n" +
                "                \"offers\": [\n" +
                "                    {\n" +
                "                        \"finskyOfferType\": 1,\n" +
                "                        \"listPrice\": {\n" +
                "                            \"amountInMicros\": 15990000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"retailPrice\": {\n" +
                "                            \"amountInMicros\": 9990000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"giftable\": true\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"accessInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"viewability\": \"PARTIAL\",\n" +
                "                \"embeddable\": true,\n" +
                "                \"publicDomain\": false,\n" +
                "                \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "                \"epub\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/Sherlock_Holmes_for_the_21st_Century-sample-epub.acsm?id=_hnMydl5ptQC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"pdf\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/Sherlock_Holmes_for_the_21st_Century-sample-pdf.acsm?id=_hnMydl5ptQC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"webReaderLink\": \"http://play.google.com/books/reader?id=_hnMydl5ptQC&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "                \"accessViewStatus\": \"SAMPLE\",\n" +
                "                \"quoteSharingAllowed\": false\n" +
                "            },\n" +
                "            \"searchInfo\": {\n" +
                "                \"textSnippet\": \"Whether Victorian or modern, he continues to fascinate. These essays explain why he is destined to be with us for years to come. Instructors considering this book for use in a course may request an examination copy here.\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"kind\": \"books#volume\",\n" +
                "            \"id\": \"5s7FycWq59gC\",\n" +
                "            \"etag\": \"pM9+jRGFpOc\",\n" +
                "            \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/5s7FycWq59gC\",\n" +
                "            \"volumeInfo\": {\n" +
                "                \"title\": \"The Memoirs of Sherlock Holmes\",\n" +
                "                \"authors\": [\n" +
                "                    \"Sir Arthur Conan Doyle\"\n" +
                "                ],\n" +
                "                \"publisher\": \"Courier Corporation\",\n" +
                "                \"publishedDate\": \"2012-05-11\",\n" +
                "                \"description\": \"Eleven of Doyle's best and most popular tales include \\\"Silver Blaze,\\\" \\\"The Greek Interpreter,\\\" and \\\"The Final Problem,\\\" the detective's notorious confrontation with Moriarty at the Reichenbach Falls.\",\n" +
                "                \"industryIdentifiers\": [\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_13\",\n" +
                "                        \"identifier\": \"9780486114354\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_10\",\n" +
                "                        \"identifier\": \"048611435X\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"readingModes\": {\n" +
                "                    \"text\": true,\n" +
                "                    \"image\": true\n" +
                "                },\n" +
                "                \"pageCount\": 208,\n" +
                "                \"printType\": \"BOOK\",\n" +
                "                \"categories\": [\n" +
                "                    \"Fiction\"\n" +
                "                ],\n" +
                "                \"maturityRating\": \"NOT_MATURE\",\n" +
                "                \"allowAnonLogging\": true,\n" +
                "                \"contentVersion\": \"0.17.17.0.preview.3\",\n" +
                "                \"panelizationSummary\": {\n" +
                "                    \"containsEpubBubbles\": false,\n" +
                "                    \"containsImageBubbles\": false\n" +
                "                },\n" +
                "                \"imageLinks\": {\n" +
                "                    \"smallThumbnail\": \"http://books.google.com/books/content?id=5s7FycWq59gC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "                    \"thumbnail\": \"http://books.google.com/books/content?id=5s7FycWq59gC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "                },\n" +
                "                \"language\": \"en\",\n" +
                "                \"previewLink\": \"http://books.google.com/books?id=5s7FycWq59gC&printsec=frontcover&dq=Sherlock+Holmes&hl=&cd=8&source=gbs_api\",\n" +
                "                \"infoLink\": \"https://play.google.com/store/books/details?id=5s7FycWq59gC&source=gbs_api\",\n" +
                "                \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-5s7FycWq59gC\"\n" +
                "            },\n" +
                "            \"saleInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"saleability\": \"FOR_SALE\",\n" +
                "                \"isEbook\": true,\n" +
                "                \"listPrice\": {\n" +
                "                    \"amount\": 0.99,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"retailPrice\": {\n" +
                "                    \"amount\": 0.99,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"buyLink\": \"https://play.google.com/store/books/details?id=5s7FycWq59gC&rdid=book-5s7FycWq59gC&rdot=1&source=gbs_api\",\n" +
                "                \"offers\": [\n" +
                "                    {\n" +
                "                        \"finskyOfferType\": 1,\n" +
                "                        \"listPrice\": {\n" +
                "                            \"amountInMicros\": 990000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"retailPrice\": {\n" +
                "                            \"amountInMicros\": 990000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"giftable\": true\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"accessInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"viewability\": \"PARTIAL\",\n" +
                "                \"embeddable\": true,\n" +
                "                \"publicDomain\": false,\n" +
                "                \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "                \"epub\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/The_Memoirs_of_Sherlock_Holmes-sample-epub.acsm?id=5s7FycWq59gC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"pdf\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/The_Memoirs_of_Sherlock_Holmes-sample-pdf.acsm?id=5s7FycWq59gC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"webReaderLink\": \"http://play.google.com/books/reader?id=5s7FycWq59gC&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "                \"accessViewStatus\": \"SAMPLE\",\n" +
                "                \"quoteSharingAllowed\": false\n" +
                "            },\n" +
                "            \"searchInfo\": {\n" +
                "                \"textSnippet\": \"Eleven of Doyle&#39;s best and most popular tales include &quot;Silver Blaze,&quot; &quot;The Greek Interpreter,&quot; and &quot;The Final Problem,&quot; the detective&#39;s notorious confrontation with Moriarty at the Reichenbach Falls.\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"kind\": \"books#volume\",\n" +
                "            \"id\": \"oe1dDwAAQBAJ\",\n" +
                "            \"etag\": \"/PF9k1OF0mw\",\n" +
                "            \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/oe1dDwAAQBAJ\",\n" +
                "            \"volumeInfo\": {\n" +
                "                \"title\": \"The Complete Sherlock Holmes\",\n" +
                "                \"authors\": [\n" +
                "                    \"Arthur Conan Doyle\"\n" +
                "                ],\n" +
                "                \"publisher\": \"Мультимедийное издательство Стрельбицкого\",\n" +
                "                \"publishedDate\": \"2018-05-31\",\n" +
                "                \"description\": \"There is no riddle that sharp mind of detective Sherlock Holmes can’t solve. Observation, intelligence, selflessness and bravery distinguish a famous literature character created by writer Arthur Conan Doyle. The inimitable duet of Sherlock Holmes and Dr Watson sets to investigation of a crime series, masterly solves complicated cases and restores justice inside and outside London.\",\n" +
                "                \"industryIdentifiers\": [\n" +
                "                    {\n" +
                "                        \"type\": \"OTHER\",\n" +
                "                        \"identifier\": \"PKEY:SMP2200000199461\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"readingModes\": {\n" +
                "                    \"text\": true,\n" +
                "                    \"image\": true\n" +
                "                },\n" +
                "                \"printType\": \"BOOK\",\n" +
                "                \"categories\": [\n" +
                "                    \"Fiction\"\n" +
                "                ],\n" +
                "                \"averageRating\": 5,\n" +
                "                \"ratingsCount\": 1,\n" +
                "                \"maturityRating\": \"NOT_MATURE\",\n" +
                "                \"allowAnonLogging\": false,\n" +
                "                \"contentVersion\": \"1.1.1.0.preview.3\",\n" +
                "                \"panelizationSummary\": {\n" +
                "                    \"containsEpubBubbles\": false,\n" +
                "                    \"containsImageBubbles\": false\n" +
                "                },\n" +
                "                \"imageLinks\": {\n" +
                "                    \"smallThumbnail\": \"http://books.google.com/books/content?id=oe1dDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "                    \"thumbnail\": \"http://books.google.com/books/content?id=oe1dDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "                },\n" +
                "                \"language\": \"en\",\n" +
                "                \"previewLink\": \"http://books.google.com/books?id=oe1dDwAAQBAJ&pg=PP1&dq=Sherlock+Holmes&hl=&cd=9&source=gbs_api\",\n" +
                "                \"infoLink\": \"https://play.google.com/store/books/details?id=oe1dDwAAQBAJ&source=gbs_api\",\n" +
                "                \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-oe1dDwAAQBAJ\"\n" +
                "            },\n" +
                "            \"saleInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"saleability\": \"FOR_SALE\",\n" +
                "                \"isEbook\": true,\n" +
                "                \"listPrice\": {\n" +
                "                    \"amount\": 1.17,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"retailPrice\": {\n" +
                "                    \"amount\": 1.17,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"buyLink\": \"https://play.google.com/store/books/details?id=oe1dDwAAQBAJ&rdid=book-oe1dDwAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "                \"offers\": [\n" +
                "                    {\n" +
                "                        \"finskyOfferType\": 1,\n" +
                "                        \"listPrice\": {\n" +
                "                            \"amountInMicros\": 1170000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"retailPrice\": {\n" +
                "                            \"amountInMicros\": 1170000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"giftable\": true\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"accessInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"viewability\": \"PARTIAL\",\n" +
                "                \"embeddable\": true,\n" +
                "                \"publicDomain\": false,\n" +
                "                \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "                \"epub\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/The_Complete_Sherlock_Holmes-sample-epub.acsm?id=oe1dDwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"pdf\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/The_Complete_Sherlock_Holmes-sample-pdf.acsm?id=oe1dDwAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"webReaderLink\": \"http://play.google.com/books/reader?id=oe1dDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "                \"accessViewStatus\": \"SAMPLE\",\n" +
                "                \"quoteSharingAllowed\": false\n" +
                "            },\n" +
                "            \"searchInfo\": {\n" +
                "                \"textSnippet\": \"There is no riddle that sharp mind of detective Sherlock Holmes can’t solve. Observation, intelligence, selflessness and bravery distinguish a famous literature character created by writer Arthur Conan Doyle.\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"kind\": \"books#volume\",\n" +
                "            \"id\": \"778gq6qon-8C\",\n" +
                "            \"etag\": \"JHk3aYHYY/c\",\n" +
                "            \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/778gq6qon-8C\",\n" +
                "            \"volumeInfo\": {\n" +
                "                \"title\": \"The Return of Sherlock Holmes\",\n" +
                "                \"authors\": [\n" +
                "                    \"Sir Arthur Conan Doyle\"\n" +
                "                ],\n" +
                "                \"publisher\": \"Courier Corporation\",\n" +
                "                \"publishedDate\": \"2012-03-06\",\n" +
                "                \"description\": \"Back by popular demand, the world's most famous detective returns from a seemingly fatal encounter with his nemesis, Professor Moriarty. Thirteen stories include \\\"The Empty House,\\\" \\\"The Dancing Men,\\\" and \\\"The Six Napoleons.\\\"\",\n" +
                "                \"industryIdentifiers\": [\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_13\",\n" +
                "                        \"identifier\": \"9780486115382\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_10\",\n" +
                "                        \"identifier\": \"0486115380\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"readingModes\": {\n" +
                "                    \"text\": true,\n" +
                "                    \"image\": true\n" +
                "                },\n" +
                "                \"pageCount\": 256,\n" +
                "                \"printType\": \"BOOK\",\n" +
                "                \"categories\": [\n" +
                "                    \"Fiction\"\n" +
                "                ],\n" +
                "                \"averageRating\": 4,\n" +
                "                \"ratingsCount\": 2,\n" +
                "                \"maturityRating\": \"NOT_MATURE\",\n" +
                "                \"allowAnonLogging\": true,\n" +
                "                \"contentVersion\": \"0.9.9.0.preview.3\",\n" +
                "                \"panelizationSummary\": {\n" +
                "                    \"containsEpubBubbles\": false,\n" +
                "                    \"containsImageBubbles\": false\n" +
                "                },\n" +
                "                \"imageLinks\": {\n" +
                "                    \"smallThumbnail\": \"http://books.google.com/books/content?id=778gq6qon-8C&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "                    \"thumbnail\": \"http://books.google.com/books/content?id=778gq6qon-8C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "                },\n" +
                "                \"language\": \"en\",\n" +
                "                \"previewLink\": \"http://books.google.com/books?id=778gq6qon-8C&printsec=frontcover&dq=Sherlock+Holmes&hl=&cd=10&source=gbs_api\",\n" +
                "                \"infoLink\": \"https://play.google.com/store/books/details?id=778gq6qon-8C&source=gbs_api\",\n" +
                "                \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-778gq6qon-8C\"\n" +
                "            },\n" +
                "            \"saleInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"saleability\": \"FOR_SALE\",\n" +
                "                \"isEbook\": true,\n" +
                "                \"listPrice\": {\n" +
                "                    \"amount\": 3.5,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"retailPrice\": {\n" +
                "                    \"amount\": 2.66,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"buyLink\": \"https://play.google.com/store/books/details?id=778gq6qon-8C&rdid=book-778gq6qon-8C&rdot=1&source=gbs_api\",\n" +
                "                \"offers\": [\n" +
                "                    {\n" +
                "                        \"finskyOfferType\": 1,\n" +
                "                        \"listPrice\": {\n" +
                "                            \"amountInMicros\": 3500000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"retailPrice\": {\n" +
                "                            \"amountInMicros\": 2660000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"giftable\": true\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"accessInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"viewability\": \"PARTIAL\",\n" +
                "                \"embeddable\": true,\n" +
                "                \"publicDomain\": false,\n" +
                "                \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "                \"epub\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/The_Return_of_Sherlock_Holmes-sample-epub.acsm?id=778gq6qon-8C&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"pdf\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/The_Return_of_Sherlock_Holmes-sample-pdf.acsm?id=778gq6qon-8C&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"webReaderLink\": \"http://play.google.com/books/reader?id=778gq6qon-8C&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "                \"accessViewStatus\": \"SAMPLE\",\n" +
                "                \"quoteSharingAllowed\": false\n" +
                "            },\n" +
                "            \"searchInfo\": {\n" +
                "                \"textSnippet\": \"Back by popular demand, the world&#39;s most famous detective returns from a seemingly fatal encounter with his nemesis, Professor Moriarty. Thirteen stories include &quot;The Empty House,&quot; &quot;The Dancing Men,&quot; and &quot;The Six Napoleons.&quot;\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"kind\": \"books#volume\",\n" +
                "            \"id\": \"UWtECwAAQBAJ\",\n" +
                "            \"etag\": \"t0fYhASrgRg\",\n" +
                "            \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/UWtECwAAQBAJ\",\n" +
                "            \"volumeInfo\": {\n" +
                "                \"title\": \"Gender and the Modern Sherlock Holmes\",\n" +
                "                \"subtitle\": \"Essays on Film and Television Adaptations Since 2009\",\n" +
                "                \"authors\": [\n" +
                "                    \" Nadine Farghaly\"\n" +
                "                ],\n" +
                "                \"publisher\": \"McFarland\",\n" +
                "                \"publishedDate\": \"2015-10-27\",\n" +
                "                \"description\": \"From his 1887 literary debut to his many film and television adaptations, Sir Arthur Conan Doyle's Sherlock Holmes has lost none of his appeal. Besides Holmes himself, no character in Conan Doyle's stories proves as interesting as the astute detective's constant companion, Dr. Watson, who somehow seems both superfluous and essential. While Conan Doyle does not depict Holmes and Watson as equals, he avoids presenting Watson as incompetent, as he was made to appear on screen for decades. A variety of reimagined Holmeses and Watsons in recent years have depicted their relationship as more nuanced and complementary. Focusing on the Guy Ritchie films, the BBC's Sherlock and CBS's Elementary, this collection of new essays explores the ideas and implications behind these adaptations.\",\n" +
                "                \"industryIdentifiers\": [\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_13\",\n" +
                "                        \"identifier\": \"9781476622811\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"ISBN_10\",\n" +
                "                        \"identifier\": \"1476622817\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"readingModes\": {\n" +
                "                    \"text\": true,\n" +
                "                    \"image\": true\n" +
                "                },\n" +
                "                \"pageCount\": 260,\n" +
                "                \"printType\": \"BOOK\",\n" +
                "                \"categories\": [\n" +
                "                    \"Literary Criticism\"\n" +
                "                ],\n" +
                "                \"maturityRating\": \"NOT_MATURE\",\n" +
                "                \"allowAnonLogging\": true,\n" +
                "                \"contentVersion\": \"1.1.1.0.preview.3\",\n" +
                "                \"panelizationSummary\": {\n" +
                "                    \"containsEpubBubbles\": false,\n" +
                "                    \"containsImageBubbles\": false\n" +
                "                },\n" +
                "                \"imageLinks\": {\n" +
                "                    \"smallThumbnail\": \"http://books.google.com/books/content?id=UWtECwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "                    \"thumbnail\": \"http://books.google.com/books/content?id=UWtECwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "                },\n" +
                "                \"language\": \"en\",\n" +
                "                \"previewLink\": \"http://books.google.com/books?id=UWtECwAAQBAJ&printsec=frontcover&dq=Sherlock+Holmes&hl=&cd=11&source=gbs_api\",\n" +
                "                \"infoLink\": \"https://play.google.com/store/books/details?id=UWtECwAAQBAJ&source=gbs_api\",\n" +
                "                \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-UWtECwAAQBAJ\"\n" +
                "            },\n" +
                "            \"saleInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"saleability\": \"FOR_SALE\",\n" +
                "                \"isEbook\": true,\n" +
                "                \"listPrice\": {\n" +
                "                    \"amount\": 15.99,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"retailPrice\": {\n" +
                "                    \"amount\": 9.99,\n" +
                "                    \"currencyCode\": \"USD\"\n" +
                "                },\n" +
                "                \"buyLink\": \"https://play.google.com/store/books/details?id=UWtECwAAQBAJ&rdid=book-UWtECwAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "                \"offers\": [\n" +
                "                    {\n" +
                "                        \"finskyOfferType\": 1,\n" +
                "                        \"listPrice\": {\n" +
                "                            \"amountInMicros\": 15990000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"retailPrice\": {\n" +
                "                            \"amountInMicros\": 9990000,\n" +
                "                            \"currencyCode\": \"USD\"\n" +
                "                        },\n" +
                "                        \"giftable\": true\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"accessInfo\": {\n" +
                "                \"country\": \"US\",\n" +
                "                \"viewability\": \"PARTIAL\",\n" +
                "                \"embeddable\": true,\n" +
                "                \"publicDomain\": false,\n" +
                "                \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "                \"epub\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/Gender_and_the_Modern_Sherlock_Holmes-sample-epub.acsm?id=UWtECwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"pdf\": {\n" +
                "                    \"isAvailable\": true,\n" +
                "                    \"acsTokenLink\": \"http://books.google.com/books/download/Gender_and_the_Modern_Sherlock_Holmes-sample-pdf.acsm?id=UWtECwAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "                },\n" +
                "                \"webReaderLink\": \"http://play.google.com/books/reader?id=UWtECwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "                \"accessViewStatus\": \"SAMPLE\",\n" +
                "                \"quoteSharingAllowed\": false\n" +
                "            },\n" +
                "            \"searchInfo\": {\n" +
                "                \"textSnippet\": \"Focusing on the Guy Ritchie films, the BBC’s Sherlock and CBS’s Elementary, this collection of new essays explores the ideas and implications behind these adaptations.\"\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }


}
