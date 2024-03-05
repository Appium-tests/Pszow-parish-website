package qa.enums;

public enum URLs {

    HOME_PAGE("https://bazylika-pszow.pl/"),
    ANNOUNCEMENTS_PAGE("https://bazylika-pszow.pl/ogloszenia-duszpasterskie/"),
    INTENTION_PAGE("https://bazylika-pszow.pl/intencje-mszalne/"),
    FUNERALS_PAGE("https://bazylika-pszow.pl/pogrzeby/"),
    STEWARDS_PAGE("https://bazylika-pszow.pl/szafarze/"),
    PRIESTS_PAGE("https://bazylika-pszow.pl/kaplani/"),
    CONFESSION_PAGE("https://bazylika-pszow.pl/spowiedz-w-bazylice/"),
    OFFICE_PAGE("https://bazylika-pszow.pl/kancelaria/"),
    PHOTO_GALLERY("https://bazylika-pszow.pl/galeria-zdjec/"),
    CONTACT_PAGE("https://bazylika-pszow.pl/kontakt/"),
    HISTORY_PAGE("https://bazylika-pszow.pl/historia-parafii/"),
    CALVARY_PAGE("https://bazylika-pszow.pl/kalwaria-pszowska/"),
    PILGRIMAGES_PAGE("https://bazylika-pszow.pl/pielgrzymki/"),
    PHOTO_GALLERY_PAGE("https://bazylika-pszow.pl/galeria-zdjec/"),
    FILM_GALLERY_PAGE("https://bazylika-pszow.pl/galeria-filmow/"),
    SUPPORT_PAGE("https://bazylika-pszow.pl/wsparcie-parafii/"),
    CHRISTENING_PAGE("https://bazylika-pszow.pl/sakramenty/"),
    FIRST_COMMUNION_PAGE("https://bazylika-pszow.pl/pierwsza-komunia/"),
    CONFIRMATION_PAGE("https://bazylika-pszow.pl/sakrament-bierzmowania/"),
    MARRIAGE_PAGE("https://bazylika-pszow.pl/sakrament-malzenstwa/"),
    CARITAS("https://bazylika-pszow.pl/caritas-i-dzialalnosc-charytatywna/"),
    COUNCIL_PAGE("https://bazylika-pszow.pl/parafialna-rada-duszpasterska/"),
    ALTAR_BOYS_PAGE("https://bazylika-pszow.pl/ministranci/"),
    MARYS_CHILDREN_PAGE("https://bazylika-pszow.pl/dzieci-maryi-2/"),
    OASIS_PAGE("https://bazylika-pszow.pl/oaza-mlodziezowa/"),
    HOME_CHURCH_PAGE("https://bazylika-pszow.pl/ruch-domowy-kosciol/"),
    CATECHESIS_PAGE("https://bazylika-pszow.pl/katecheza-doroslych/"),
    POCO_PAGE("https://bazylika-pszow.pl/grupa-poco/"),
    LEGION_OF_MARY("https://bazylika-pszow.pl/legion-maryi/"),
    LIVING_ROSARY_PAGE("https://bazylika-pszow.pl/bractwo-zywego-rozanca/"),
    MOTHERS_COMMUNITY("https://bazylika-pszow.pl/wspolnota-matki-milosiernego/"),
    LITANY_PAGE("https://bazylika-pszow.pl/litania-do-pani-usmiechnietej/"),
    CEMENTERY_REGULATION("https://bazylika-pszow.pl/regulamin-cmentarza/"),
    DELEGATE_PAGE("https://bazylika-pszow.pl/delegat-ds-ochrony-dzieci-i-mlodziezy/"),
    ARCHDIOCESE("https://www.archidiecezjakatowicka.pl/"),
    READING("https://www.paulus.org.pl/czytania"),
    FACEBOOK_PAGE("https://www.facebook.com"),
    YOUTUBE_PAGE("https://consent.youtube.com/"),
    YOUTUBE_TRANSMISSION("https://www.youtube.com/watch");

    private final String name;

    URLs(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
