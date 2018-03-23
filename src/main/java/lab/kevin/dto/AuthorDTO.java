package lab.kevin.dto;

import java.util.Date;
import java.util.Objects;

public class AuthorDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Integer yearOfBirth;
    private Integer distinguished;

    public AuthorDTO(Integer id, String firstName, String lastName, Date dateOfBirth, Integer yearOfBirth, Integer distinguished) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.distinguished = distinguished;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getDistinguished() {
        return distinguished;
    }

    public void setDistinguished(Integer distinguished) {
        this.distinguished = distinguished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorDTO authorDTO = (AuthorDTO) o;
        return Objects.equals(id, authorDTO.id) &&
                Objects.equals(firstName, authorDTO.firstName) &&
                Objects.equals(lastName, authorDTO.lastName) &&
                Objects.equals(dateOfBirth, authorDTO.dateOfBirth) &&
                Objects.equals(yearOfBirth, authorDTO.yearOfBirth) &&
                Objects.equals(distinguished, authorDTO.distinguished);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, dateOfBirth, yearOfBirth, distinguished);
    }
}
