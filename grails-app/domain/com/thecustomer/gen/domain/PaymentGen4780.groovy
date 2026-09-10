// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class PaymentGen4780 {

    Boolean reference0
    Boolean unitPrice1
    BigDecimal description2
    String amount3
    BigDecimal priority4
    Integer sortOrder5
    Date externalId6
    Boolean externalId7
    String currency8

    static constraints = {
        reference0 nullable: true
        unitPrice1 nullable: true
        description2 nullable: true
        amount3 nullable: true, maxSize: 255
        priority4 nullable: true
        sortOrder5 nullable: true
        externalId6 nullable: true
        externalId7 nullable: true
        currency8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'settlement_gen_4780'
    }

    String toString() { "PaymentGen4780(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 5469 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 713 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 8994 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 6301 }
    /** Derived accessor for version (generated filler). */
    def computeVersion4() { return 409 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes5() { return 1019 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice6() { return 8046 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 1826 }
    /** Derived accessor for code (generated filler). */
    def computeCode8() { return 1199 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 8031 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 963 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 3677 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 3855 }
    /** Derived accessor for status (generated filler). */
    def computeStatus13() { return 3911 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency14() { return 466 }
    /** Derived accessor for label (generated filler). */
    def computeLabel15() { return 3239 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg16() { return 6386 }
    /** Derived accessor for code (generated filler). */
    def computeCode17() { return 4965 }
    /** Derived accessor for label (generated filler). */
    def computeLabel18() { return 1022 }
    /** Derived accessor for priority (generated filler). */
    def computePriority19() { return 9202 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency20() { return 2376 }
    /** Derived accessor for active (generated filler). */
    def computeActive21() { return 5677 }
}
