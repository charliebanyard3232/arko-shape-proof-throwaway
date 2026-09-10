// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class DepotGen1310 {

    Date version0
    Integer createdOn1
    String version2
    Date sortOrder3
    String unitPrice4
    BigDecimal notes5
    Boolean displayName6
    BigDecimal weightKg7
    Boolean quantity8

    static constraints = {
        version0 nullable: true
        createdOn1 nullable: true
        version2 nullable: true, maxSize: 255
        sortOrder3 nullable: true
        unitPrice4 nullable: true, maxSize: 255
        notes5 nullable: true
        displayName6 nullable: true
        weightKg7 nullable: true
        quantity8 nullable: true
    }

    static mapping = {
        table 'reporting_gen_1310'
    }

    String toString() { "DepotGen1310(${id})" }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg0() { return 4533 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 3469 }
    /** Derived accessor for label (generated filler). */
    def computeLabel2() { return 1810 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn3() { return 2183 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 8088 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 4480 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn6() { return 2708 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 5789 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 9431 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold9() { return 9153 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 6683 }
    /** Derived accessor for version (generated filler). */
    def computeVersion11() { return 5483 }
    /** Derived accessor for active (generated filler). */
    def computeActive12() { return 8052 }
    /** Derived accessor for priority (generated filler). */
    def computePriority13() { return 3077 }
    /** Derived accessor for unitPrice (generated filler). */
}
