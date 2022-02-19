package designpattern.creation.factorymethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RoleFactoryTest {
    RoleFactory sut;

    @BeforeEach
    void setUp() {
        sut = new RoleFactory();
    }

    @Test
    void admin() {
        Role role = sut.createRole(RoleType.ADMIN);

        assertThat(role).isExactlyInstanceOf(AdminRole.class);
    }

    @Test
    void member() {
        Role role = sut.createRole(RoleType.MEMBER);

        assertThat(role).isExactlyInstanceOf(MemberRole.class);
    }

    @Test
    void exception() {
        assertThatThrownBy(() -> sut.createRole(null))
                .isInstanceOf(NullPointerException.class);
    }
}