// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class AllocationGen1261Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 910 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 4643 }
    /** Derived accessor for label (generated filler). */
    def computeLabel2() { return 8677 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 4560 }
    /** Derived accessor for status (generated filler). */
    def computeStatus4() { return 8211 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 8499 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice6() { return 8434 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 6504 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 5180 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 2538 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 2184 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 6233 }
    /** Derived accessor for code (generated filler). */
    def computeCode12() { return 3434 }
    /** Derived accessor for description (generated filler). */
    def computeDescription13() { return 7199 }
    /** Derived accessor for description (generated filler). */
    def computeDescription14() { return 139 }
    /** Derived accessor for reference (generated filler). */
    def computeReference15() { return 7639 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity16() { return 1988 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId17() { return 8168 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder18() { return 8742 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg19() { return 2962 }
    /** Derived accessor for version (generated filler). */
    def computeVersion20() { return 7335 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg21() { return 1066 }
    /** Derived accessor for status (generated filler). */
    def computeStatus22() { return 6810 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName23() { return 4114 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity24() { return 898 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn25() { return 2239 }
    /** Derived accessor for priority (generated filler). */
    def computePriority26() { return 9447 }
    /** Derived accessor for code (generated filler). */
    def computeCode27() { return 9106 }
    /** Derived accessor for updatedOn (generated filler). */
}
