package org.zerock.signmate.Contract.domain;

import jakarta.persistence.*;
import lombok.*;
import org.zerock.signmate.user.domain.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "contract")
public class Contract extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private enums.ContractType contractType; // SERVICE, EMPLOYMENT 등

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private User writer;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

}

