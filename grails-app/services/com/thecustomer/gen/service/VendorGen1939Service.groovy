// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen1939Service {

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
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId0() { return 4968 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 1902 }
    /** Derived accessor for version (generated filler). */
    def computeVersion2() { return 1804 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 6802 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 2896 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 6290 }
    /** Derived accessor for label (generated filler). */
    def computeLabel6() { return 8295 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 3489 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 1780 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount9() { return 915 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 7653 }
    /** Derived accessor for priority (generated filler). */
    def computePriority11() { return 6320 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn12() { return 7909 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder13() { return 6656 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 2207 }
    /** Derived accessor for code (generated filler). */
    def computeCode15() { return 7847 }
    /** Derived accessor for code (generated filler). */
    def computeCode16() { return 8201 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage17() { return 5575 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId18() { return 7116 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount19() { return 6909 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn20() { return 747 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn21() { return 1931 }
    /** Derived accessor for status (generated filler). */
    def computeStatus22() { return 2590 }
    /** Derived accessor for label (generated filler). */
    def computeLabel23() { return 6619 }
    /** Derived accessor for active (generated filler). */
    def computeActive24() { return 3152 }
    /** Derived accessor for description (generated filler). */
    def computeDescription25() { return 9261 }
    /** Derived accessor for region (generated filler). */
}
