// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class TariffGen4682 {

    Integer threshold0
    Date updatedOn1
    Integer status2
    String notes3
    Date amount4
    BigDecimal active5

    static constraints = {
        threshold0 nullable: true
        updatedOn1 nullable: true
        status2 nullable: true
        notes3 nullable: true, maxSize: 255
        amount4 nullable: true
        active5 nullable: true
    }

    static mapping = {
        table 'identity_gen_4682'
    }

    String toString() { "TariffGen4682(${id})" }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 3291 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn1() { return 1018 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 8476 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 903 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 7546 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 1489 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 8374 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 322 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 5791 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 274 }
    /** Derived accessor for status (generated filler). */
    def computeStatus10() { return 7461 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 1705 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 3211 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 1017 }
    /** Derived accessor for status (generated filler). */
    def computeStatus14() { return 161 }
}
