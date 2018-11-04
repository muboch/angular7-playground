package ch.mubo.bkmonitor.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "LOGMESSAGE")
@Table
public class LogMessage {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name ="XMLIN")
    private String xmlIn;
    @Column(name = "XMLOUT")
    private String xmlOut;
}
