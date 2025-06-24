package enums;

public enum StudyProfile {

    LINGUISTICS("Лингвистика"),
    MEDICINE ("Медицина"),
    HISTORY("История"),
    MATHEMATICS("Математика"),
    PHYSICS("Физика"),
    IZO("ИЗО");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
