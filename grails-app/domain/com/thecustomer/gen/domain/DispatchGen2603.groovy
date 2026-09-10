// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class DispatchGen2603 {

    BigDecimal reference0
    String description1
    Boolean externalId2
    String status3
    String currency4
    Date notes5
    Integer category6
    Date code7

    static constraints = {
        reference0 nullable: true
        description1 nullable: true, maxSize: 255
        externalId2 nullable: true
        status3 nullable: true, maxSize: 255
        currency4 nullable: true, maxSize: 255
        notes5 nullable: true
        category6 nullable: true
        code7 nullable: true
    }

    static mapping = {
        table 'reporting_gen_2603'
    }

    String toString() { "DispatchGen2603(${id})" }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 8247 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 105 }
    /** Derived accessor for label (generated filler). */
    def computeLabel2() { return 5221 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 5680 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 5682 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 7626 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 3769 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 2666 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 388 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 9851 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice10() { return 4848 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 6213 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 9866 }
    /** Derived accessor for priority (generated filler). */
    def computePriority13() { return 7847 }
    /** Derived accessor for region (generated filler). */
    def computeRegion14() { return 9883 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount15() { return 1489 }
    /** Derived accessor for active (generated filler). */
    def computeActive16() { return 4772 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage17() { return 9236 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn18() { return 579 }
}
