// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen5673Service {

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
    def computeExternalId0() { return 515 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 7125 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 2845 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 7135 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 9079 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 9752 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes6() { return 8407 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 3238 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 3902 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 3807 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice10() { return 9509 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount11() { return 9763 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn12() { return 8610 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn13() { return 5938 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder14() { return 5262 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes15() { return 3743 }
    /** Derived accessor for description (generated filler). */
    def computeDescription16() { return 9557 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn17() { return 7393 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount18() { return 49 }
    /** Derived accessor for version (generated filler). */
    def computeVersion19() { return 485 }
    /** Derived accessor for priority (generated filler). */
    def computePriority20() { return 7012 }
    /** Derived accessor for description (generated filler). */
    def computeDescription21() { return 5609 }
    /** Derived accessor for region (generated filler). */
    def computeRegion22() { return 1714 }
    /** Derived accessor for status (generated filler). */
    def computeStatus23() { return 5854 }
    /** Derived accessor for active (generated filler). */
    def computeActive24() { return 9040 }
    /** Derived accessor for status (generated filler). */
}
